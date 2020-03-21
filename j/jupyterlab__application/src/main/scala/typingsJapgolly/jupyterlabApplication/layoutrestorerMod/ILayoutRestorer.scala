package typingsJapgolly.jupyterlabApplication.layoutrestorerMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.jupyterlabApputils.mod.WidgetTracker
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IRestorable
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IRestorer
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IRestorer.IOptions
import typingsJapgolly.phosphorCoreutils.mod.Token
import typingsJapgolly.phosphorDisposable.mod.IObservableDisposable
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayoutRestorer
  extends IRestorer[IRestorable[IObservableDisposable, js.Any], IObservableDisposable, js.Any] {
  /**
    * A promise resolved when the layout restorer is ready to receive signals.
    */
  @JSName("restored")
  var restored_ILayoutRestorer: js.Promise[Unit]
  /**
    * Add a widget to be tracked by the layout restorer.
    */
  def add(widget: Widget, name: String): Unit
  /**
    * Restore the widgets of a particular widget tracker.
    *
    * @param tracker - The widget tracker whose widgets will be restored.
    *
    * @param options - The restoration options.
    */
  def restore[T /* <: Widget */](tracker: WidgetTracker[T], options: IOptions[T]): js.Promise[_]
}

@JSImport("@jupyterlab/application/lib/layoutrestorer", "ILayoutRestorer")
@js.native
object ILayoutRestorer extends TopLevel[Token[ILayoutRestorer]]

