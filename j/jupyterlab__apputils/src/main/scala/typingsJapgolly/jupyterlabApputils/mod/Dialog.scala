package typingsJapgolly.jupyterlabApputils.mod

import typingsJapgolly.jupyterlabApputils.PartialIButton
import typingsJapgolly.jupyterlabApputils.ReadonlyIButton
import typingsJapgolly.jupyterlabApputils.dialogMod.Dialog.IOptions
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "Dialog")
@js.native
/**
  * Create a dialog panel instance.
  *
  * @param options - The dialog setup options.
  */
class Dialog[T] ()
  extends typingsJapgolly.jupyterlabApputils.dialogMod.Dialog[T] {
  def this(options: Partial[IOptions[T]]) = this()
}

@JSImport("@jupyterlab/apputils", "Dialog")
@js.native
object Dialog extends js.Object {
  /**
    * The default implementation of a dialog renderer.
    */
  @js.native
  class Renderer ()
    extends typingsJapgolly.jupyterlabApputils.dialogMod.Dialog.Renderer
  
  /**
    * The default renderer instance.
    */
  val defaultRenderer: typingsJapgolly.jupyterlabApputils.dialogMod.Dialog.Renderer = js.native
  /**
    * The dialog widget tracker.
    */
  val tracker: typingsJapgolly.jupyterlabApputils.widgettrackerMod.WidgetTracker[typingsJapgolly.jupyterlabApputils.dialogMod.Dialog[js.Any]] = js.native
  /**
    * Create a reject button.
    */
  def cancelButton(): ReadonlyIButton = js.native
  def cancelButton(options: PartialIButton): ReadonlyIButton = js.native
  /**
    * Create a button item.
    */
  def createButton(value: PartialIButton): ReadonlyIButton = js.native
  /**
    * Disposes all dialog instances.
    *
    * #### Notes
    * This function should only be used in tests or cases where application state
    * may be discarded.
    */
  def flush(): Unit = js.native
  /**
    * Create an accept button.
    */
  def okButton(): ReadonlyIButton = js.native
  def okButton(options: PartialIButton): ReadonlyIButton = js.native
  /**
    * Create a warn button.
    */
  def warnButton(): ReadonlyIButton = js.native
  def warnButton(options: PartialIButton): ReadonlyIButton = js.native
}

