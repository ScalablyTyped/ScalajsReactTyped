package typingsJapgolly.carbonComponents.mod

import typingsJapgolly.carbonComponents.anon.PartialPaginationOptions
import typingsJapgolly.carbonComponents.componentsPaginationPaginationMod.PaginationOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "Pagination")
@js.native
open class Pagination protected ()
  extends typingsJapgolly.carbonComponents.globalsJsComponentsMod.Pagination {
  def this(element: Any) = this()
  def this(element: Any, options: PartialPaginationOptions) = this()
}
object Pagination {
  
  @JSImport("carbon-components", "Pagination")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "Pagination.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("carbon-components", "Pagination.options")
  @js.native
  def options: PaginationOptions = js.native
  inline def options_=(x: PaginationOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
