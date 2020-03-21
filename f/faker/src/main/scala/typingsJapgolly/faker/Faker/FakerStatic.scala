package typingsJapgolly.faker.Faker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.faker.AnonAbbreviation
import typingsJapgolly.faker.AnonAbstract
import typingsJapgolly.faker.AnonAccount
import typingsJapgolly.faker.AnonAlphaNumeric
import typingsJapgolly.faker.AnonAvatar
import typingsJapgolly.faker.AnonBetween
import typingsJapgolly.faker.AnonBranch
import typingsJapgolly.faker.AnonBs
import typingsJapgolly.faker.AnonCity
import typingsJapgolly.faker.AnonCollation
import typingsJapgolly.faker.AnonColor
import typingsJapgolly.faker.AnonCommonFileExt
import typingsJapgolly.faker.AnonContextualCard
import typingsJapgolly.faker.AnonFindName
import typingsJapgolly.faker.AnonFuel
import typingsJapgolly.faker.AnonLines
import typingsJapgolly.faker.AnonPhoneFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakerStatic extends js.Object {
  var address: AnonCity
  var commerce: AnonColor
  var company: AnonBs
  var database: AnonCollation
  var date: AnonBetween
  var finance: AnonAccount
  var git: AnonBranch
  var hacker: AnonAbbreviation
  var helpers: AnonContextualCard
  var image: AnonAbstract
  var internet: AnonAvatar
  var locale: String
  var lorem: AnonLines
  var name: AnonFindName
  var phone: AnonPhoneFormats
  var random: AnonAlphaNumeric
  var seedValue: js.UndefOr[Double] = js.undefined
  var system: AnonCommonFileExt
  var vehicle: AnonFuel
  def fake(str: String): String
  def seed(value: Double): Unit
  def setLocale(locale: String): Unit
}

object FakerStatic {
  @scala.inline
  def apply(
    address: AnonCity,
    commerce: AnonColor,
    company: AnonBs,
    database: AnonCollation,
    date: AnonBetween,
    fake: String => CallbackTo[String],
    finance: AnonAccount,
    git: AnonBranch,
    hacker: AnonAbbreviation,
    helpers: AnonContextualCard,
    image: AnonAbstract,
    internet: AnonAvatar,
    locale: String,
    lorem: AnonLines,
    name: AnonFindName,
    phone: AnonPhoneFormats,
    random: AnonAlphaNumeric,
    seed: Double => Callback,
    setLocale: String => Callback,
    system: AnonCommonFileExt,
    vehicle: AnonFuel,
    seedValue: Int | Double = null
  ): FakerStatic = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], commerce = commerce.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], database = database.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], finance = finance.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], hacker = hacker.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], internet = internet.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], lorem = lorem.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], vehicle = vehicle.asInstanceOf[js.Any])
    __obj.updateDynamic("fake")(js.Any.fromFunction1((t0: java.lang.String) => fake(t0).runNow()))
    __obj.updateDynamic("seed")(js.Any.fromFunction1((t0: scala.Double) => seed(t0).runNow()))
    __obj.updateDynamic("setLocale")(js.Any.fromFunction1((t0: java.lang.String) => setLocale(t0).runNow()))
    if (seedValue != null) __obj.updateDynamic("seedValue")(seedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FakerStatic]
  }
}

