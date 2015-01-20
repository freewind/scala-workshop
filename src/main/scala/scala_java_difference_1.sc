case class Member(name: String, age: Int, male: Boolean, hobby: String)

val members = Seq(
  Member("Juan", 18, male = false, "looking for true love"),
  Member("Xinyu", 40, male = true, "acting as a young boy"),
  Member("Tong", 25, male = false, "buying houses"),
  Member("SunChen", 18, male = false, "me me da"),
  Member("Jinwen", 20, male = true, "meng")
)

//
members
  .filter(_.name.length == 4)

//
members
  .filter(_.age <= 25)
  .filterNot(_.male)
  .map(_.name)
  .map(_ + "*")
