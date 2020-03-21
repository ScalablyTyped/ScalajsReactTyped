package typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML attribute.
  *
  *     // Reads the first and last name of each person and adds a new attribute with the full name.
  *     var xml = '<roster>'
  *         + '<person first="John" last="Doe"/>'
  *         + '<person first="Mary" last="Smith"/>'
  *         + '</roster>';
  *     var document = XmlService.parse(xml);
  *     var people = document.getRootElement().getChildren('person');
  *     for (var i = 0; i < people.length; i++) {
  *       var person = people[i];
  *       var firstName = person.getAttribute('first').getValue();
  *       var lastName = person.getAttribute('last').getValue();
  *       person.setAttribute('full', firstName + ' ' + lastName);
  *     }
  *     xml = XmlService.getPrettyFormat().format(document);
  *     Logger.log(xml);
  */
trait Attribute extends js.Object {
  def getName(): String
  def getNamespace(): Namespace
  def getValue(): String
  def setName(name: String): Attribute
  def setNamespace(namespace: Namespace): Attribute
  def setValue(value: String): Attribute
}

object Attribute {
  @scala.inline
  def apply(
    getName: CallbackTo[String],
    getNamespace: CallbackTo[Namespace],
    getValue: CallbackTo[String],
    setName: String => CallbackTo[Attribute],
    setNamespace: Namespace => CallbackTo[Attribute],
    setValue: String => CallbackTo[Attribute]
  ): Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getNamespace")(getNamespace.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    __obj.updateDynamic("setNamespace")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.XMLService.Namespace) => setNamespace(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: java.lang.String) => setValue(t0).runNow()))
    __obj.asInstanceOf[Attribute]
  }
}

