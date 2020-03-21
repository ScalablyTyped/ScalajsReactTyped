package typingsJapgolly.fluentReact.mod

import typingsJapgolly.fluentBundle.mod.FluentBundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fluent/react", "ReactLocalization")
@js.native
class ReactLocalization protected () extends js.Object {
  def this(bundles: js.Iterable[FluentBundle]) = this()
  def getBundle(id: String): FluentBundle | Null = js.native
  def getBundle(id: js.Array[String]): js.Array[FluentBundle | Null] = js.native
  def getString(id: String): String = js.native
  def getString(id: String, args: js.Object): String = js.native
  def getString(id: String, args: js.Object, fallback: String): String = js.native
  def reportError(error: String): Unit = js.native
  def setBundles(bundles: js.Iterable[FluentBundle]): Unit = js.native
  def subscribe(component: ReactLocalizationNotification): Unit = js.native
  def unsubscribe(component: ReactLocalizationNotification): Unit = js.native
}

