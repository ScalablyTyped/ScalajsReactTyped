package typingsJapgolly.androiduix.android.content

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.androiduix.android.app.Application
import typingsJapgolly.androiduix.android.content.res.Resources
import typingsJapgolly.androiduix.android.content.res.TypedArray
import typingsJapgolly.androiduix.android.view.LayoutInflater
import typingsJapgolly.androiduix.android.view.WindowManager
import typingsJapgolly.androiduix.androidui.AndroidUI
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.content.Context")
@js.native
abstract class Context protected () extends js.Object {
  def this(androidUI: AndroidUI) = this()
  var androidUI: AndroidUI = js.native
  var mLayoutInflater: js.Any = js.native
  var mResources: js.Any = js.native
  def getApplicationContext(): Application = js.native
  def getLayoutInflater(): LayoutInflater = js.native
  def getResources(): Resources = js.native
  def getWindowManager(): WindowManager = js.native
  def obtainStyledAttributes(attrs: HTMLElement): TypedArray = js.native
  def obtainStyledAttributes(attrs: HTMLElement, defStyleAttr: Map[String, String]): TypedArray = js.native
}

