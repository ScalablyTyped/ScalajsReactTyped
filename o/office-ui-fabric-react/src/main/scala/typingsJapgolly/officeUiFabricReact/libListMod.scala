package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.listTypesMod.IListProps
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/List", JSImport.Namespace)
@js.native
object libListMod extends js.Object {
  @js.native
  class List[T] protected ()
    extends typingsJapgolly.officeUiFabricReact.listMod.List[T] {
    def this(props: IListProps[T]) = this()
  }
  
  /* static members */
  @js.native
  object List extends js.Object {
    var defaultProps: AnonOnRenderCell = js.native
  }
  
  @js.native
  object ScrollToMode extends js.Object {
    /**
      * Does not make any consideration to where in the viewport the item should align to.
      */
    var auto: `0` = js.native
    /**
      * Attempts to scroll the list so the bottom of the desired item is aligned with the bottom of the viewport.
      */
    var bottom: `2` = js.native
    /**
      * Attempts to scroll the list so the desired item is in the exact center of the viewport.
      */
    var center: `3` = js.native
    /**
      * Attempts to scroll the list so the top of the desired item is aligned with the top of the viewport.
      */
    var top: `1` = js.native
  }
  
}

