package typingsJapgolly.sortablejs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.sortablejs.pluginsMod.SortablePlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sortablejs", JSImport.Namespace)
@js.native
class ^ protected () extends Sortable {
  /**
    * Sortable's main constructor.
    * @param element Any variety of HTMLElement.
    * @param options Sortable options object.
    */
  def this(element: HTMLElement, options: Options) = this()
}

@JSImport("sortablejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var active: Sortable = js.native
  var utils: Utils = js.native
  /**
    * Creation of new instances.
    * @param element Any variety of HTMLElement.
    * @param options Sortable options object.
    */
  def create(element: HTMLElement): Sortable = js.native
  def create(element: HTMLElement, options: Options): Sortable = js.native
  /**
    * Mounts a plugin to Sortable
    * @param sortablePlugin a sortable plugin.
    *
    * @example
    *
    * Sortable.mount(new MultiDrag(), new AutoScroll())
    */
  def mount(sortablePlugins: SortablePlugin*): Unit = js.native
}

