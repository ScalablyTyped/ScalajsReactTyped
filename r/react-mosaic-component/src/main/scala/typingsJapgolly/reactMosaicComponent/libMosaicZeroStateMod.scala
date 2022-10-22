package typingsJapgolly.reactMosaicComponent

import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicContext
import typingsJapgolly.reactMosaicComponent.libTypesMod.CreateNode
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMosaicZeroStateMod {
  
  @JSImport("react-mosaic-component/lib/MosaicZeroState", "MosaicZeroState")
  @js.native
  open class MosaicZeroState[T /* <: MosaicKey */] protected ()
    extends PureComponent[MosaicZeroStateProps[T], js.Object, Any] {
    def this(props: MosaicZeroStateProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicZeroStateProps[T], context: Any) = this()
    
    @JSName("context")
    var context_MosaicZeroState: MosaicContext[T] = js.native
    
    /* private */ var replace: Any = js.native
  }
  /* static members */
  object MosaicZeroState {
    
    @JSImport("react-mosaic-component/lib/MosaicZeroState", "MosaicZeroState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component/lib/MosaicZeroState", "MosaicZeroState.contextType")
    @js.native
    def contextType: Context[MosaicContext[MosaicKey]] = js.native
    inline def contextType_=(x: Context[MosaicContext[MosaicKey]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  trait MosaicZeroStateProps[T /* <: MosaicKey */] extends StObject {
    
    var createNode: js.UndefOr[CreateNode[T]] = js.undefined
  }
  object MosaicZeroStateProps {
    
    inline def apply[T /* <: MosaicKey */](): MosaicZeroStateProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MosaicZeroStateProps[T]]
    }
    
    extension [Self <: MosaicZeroStateProps[?], T /* <: MosaicKey */](x: Self & MosaicZeroStateProps[T]) {
      
      inline def setCreateNode(value: CreateNode[T]): Self = StObject.set(x, "createNode", value.asInstanceOf[js.Any])
      
      inline def setCreateNodeUndefined: Self = StObject.set(x, "createNode", js.undefined)
    }
  }
}
