package typingsJapgolly.jupyterlabApputilsExtension

import typingsJapgolly.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typingsJapgolly.jupyterlabApplication.layoutrestorerMod.ILayoutRestorer
import typingsJapgolly.jupyterlabApplication.mod.JupyterFrontEnd
import typingsJapgolly.jupyterlabApputils.commandpaletteMod.ICommandPalette
import typingsJapgolly.jupyterlabApputils.commandpaletteMod.IPaletteItem
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorWidgets.mod.CommandPalette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils-extension/lib/palette", JSImport.Namespace)
@js.native
object paletteMod extends js.Object {
  @js.native
  class Palette protected () extends ICommandPalette {
    /**
      * Create a palette instance.
      */
    def this(palette: CommandPalette) = this()
    var _palette: js.Any = js.native
    /**
      * The placeholder text of the command palette's search input.
      */
    /* CompleteClass */
    override var placeholder: String = js.native
    /**
      * Activate the command palette for user input.
      */
    /* CompleteClass */
    override def activate(): Unit = js.native
    /**
      * Add a command item to the command palette.
      *
      * @param options - The options for creating the command item.
      *
      * @returns A disposable that will remove the item from the palette.
      */
    /* CompleteClass */
    override def addItem(options: IPaletteItem): IDisposable = js.native
  }
  
  @js.native
  object Palette extends js.Object {
    /**
      * Activate the command palette.
      */
    def activate(app: JupyterFrontEnd[IShell]): ICommandPalette = js.native
    /**
      * Restore the command palette.
      */
    def restore(app: JupyterFrontEnd[IShell], restorer: ILayoutRestorer): Unit = js.native
  }
  
}

