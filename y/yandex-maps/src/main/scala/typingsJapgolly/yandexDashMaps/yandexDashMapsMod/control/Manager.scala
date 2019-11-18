package typingsJapgolly.yandexDashMaps.yandexDashMapsMod.control

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.ControlKey
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.IControl
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "control.Manager")
@js.native
class Manager protected () extends js.Object {
  def this(map: Map) = this()
  def this(map: Map, controls: js.Array[String | IControl]) = this()
  def this(map: Map, controls: js.Array[String | IControl], options: IManagerOptions) = this()
  var events: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.event.Manager = js.native
  var options: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.option.Manager = js.native
  var state: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.data.Manager = js.native
  def add(control: ControlKey): this.type = js.native
  def add(control: ControlKey, options: IManagerControlOptions): this.type = js.native
  def add(control: IControl): this.type = js.native
  def add(control: IControl, options: IManagerControlOptions): this.type = js.native
  def each(callback: js.Function1[/* control */ IControl, Unit]): this.type = js.native
  def each(callback: js.Function1[/* control */ IControl, Unit], context: js.Object): this.type = js.native
  def get(index: String): IControl | Null = js.native
  def get(index: Double): IControl | Null = js.native
  def getChildElement(control: IControl): js.Promise[HTMLElement] = js.native
  def getContainer(): HTMLElement = js.native
  def getMap(): Map = js.native
  def indexOf(childToFind: String): Double = js.native
  def indexOf(childToFind: IControl): Double = js.native
  def remove(control: String): this.type = js.native
  def remove(control: IControl): this.type = js.native
}

