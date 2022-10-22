package typingsJapgolly.reactMosaicComponent

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.react.mod.ReactPortal
import typingsJapgolly.reactMosaicComponent.anon.BlueprintNamespace
import typingsJapgolly.reactMosaicComponent.anon.ClassName
import typingsJapgolly.reactMosaicComponent.anon.PartialMosaicStateMosaicK
import typingsJapgolly.reactMosaicComponent.libButtonsMosaicButtonMod.MosaicButtonProps
import typingsJapgolly.reactMosaicComponent.libInternalTypesMod.MosaicDropTargetPosition
import typingsJapgolly.reactMosaicComponent.libMosaicMod.MosaicProps
import typingsJapgolly.reactMosaicComponent.libMosaicMod.MosaicState
import typingsJapgolly.reactMosaicComponent.libMosaicWindowMod.MosaicWindowProps
import typingsJapgolly.reactMosaicComponent.libMosaicZeroStateMod.MosaicZeroStateProps
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicBranch
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicDirection
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicKey
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicNode
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicPath
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicUpdate
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicUpdateSpec
import typingsJapgolly.reactMosaicComponent.libUtilMosaicUtilitiesMod.Corner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-mosaic-component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-mosaic-component", "Corner")
  @js.native
  object Corner extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.reactMosaicComponent.libUtilMosaicUtilitiesMod.Corner & Double] = js.native
    
    /* 3 */ val BOTTOM_LEFT: typingsJapgolly.reactMosaicComponent.libUtilMosaicUtilitiesMod.Corner.BOTTOM_LEFT & Double = js.native
    
    /* 4 */ val BOTTOM_RIGHT: typingsJapgolly.reactMosaicComponent.libUtilMosaicUtilitiesMod.Corner.BOTTOM_RIGHT & Double = js.native
    
    /* 1 */ val TOP_LEFT: typingsJapgolly.reactMosaicComponent.libUtilMosaicUtilitiesMod.Corner.TOP_LEFT & Double = js.native
    
    /* 2 */ val TOP_RIGHT: typingsJapgolly.reactMosaicComponent.libUtilMosaicUtilitiesMod.Corner.TOP_RIGHT & Double = js.native
  }
  
  @JSImport("react-mosaic-component", "DEFAULT_CONTROLS_WITHOUT_CREATION")
  @js.native
  val DEFAULT_CONTROLS_WITHOUT_CREATION: js.Array[String | Double | Element | ReactFragment | ReactPortal] = js.native
  
  @JSImport("react-mosaic-component", "DEFAULT_CONTROLS_WITH_CREATION")
  @js.native
  val DEFAULT_CONTROLS_WITH_CREATION: js.Array[String | Double | Element | ReactFragment | ReactPortal] = js.native
  
  inline def DefaultToolbarButton(hasTitleClassNameOnClickText: ClassName): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultToolbarButton")(hasTitleClassNameOnClickText.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  @JSImport("react-mosaic-component", "ExpandButton")
  @js.native
  open class ExpandButton protected ()
    extends typingsJapgolly.reactMosaicComponent.libButtonsExpandButtonMod.ExpandButton {
    def this(props: MosaicButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicButtonProps, context: Any) = this()
  }
  /* static members */
  object ExpandButton {
    
    @JSImport("react-mosaic-component", "ExpandButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component", "ExpandButton.contextType")
    @js.native
    def contextType: Context[typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicWindowContext] = js.native
    inline def contextType_=(x: Context[typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicWindowContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-mosaic-component", "Mosaic")
  @js.native
  open class Mosaic[T /* <: MosaicKey */] protected ()
    extends typingsJapgolly.reactMosaicComponent.libMosaicMod.Mosaic[T] {
    def this(props: MosaicProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicProps[T], context: Any) = this()
  }
  
  @JSImport("react-mosaic-component", "MosaicContext")
  @js.native
  val MosaicContext: Context[typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicContext[MosaicKey]] = js.native
  
  object MosaicDragType {
    
    @JSImport("react-mosaic-component", "MosaicDragType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component", "MosaicDragType.WINDOW")
    @js.native
    def WINDOW: String = js.native
    inline def WINDOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOW")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-mosaic-component", "MosaicWindow")
  @js.native
  open class MosaicWindow[T /* <: MosaicKey */] protected ()
    extends typingsJapgolly.reactMosaicComponent.libMosaicWindowMod.MosaicWindow[T] {
    def this(props: MosaicWindowProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicWindowProps[T], context: Any) = this()
  }
  
  @JSImport("react-mosaic-component", "MosaicWindowContext")
  @js.native
  val MosaicWindowContext: Context[typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicWindowContext] = js.native
  
  @JSImport("react-mosaic-component", "MosaicWithoutDragDropContext")
  @js.native
  open class MosaicWithoutDragDropContext[T /* <: MosaicKey */] protected ()
    extends typingsJapgolly.reactMosaicComponent.libMosaicMod.MosaicWithoutDragDropContext[T] {
    def this(props: MosaicProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicProps[T], context: Any) = this()
  }
  /* static members */
  object MosaicWithoutDragDropContext {
    
    @JSImport("react-mosaic-component", "MosaicWithoutDragDropContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component", "MosaicWithoutDragDropContext.defaultProps")
    @js.native
    def defaultProps: BlueprintNamespace = js.native
    inline def defaultProps_=(x: BlueprintNamespace): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: MosaicProps[MosaicKey], prevState: MosaicState[MosaicKey]): PartialMosaicStateMosaicK | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialMosaicStateMosaicK | Null]
  }
  
  @JSImport("react-mosaic-component", "MosaicZeroState")
  @js.native
  open class MosaicZeroState[T /* <: MosaicKey */] protected ()
    extends typingsJapgolly.reactMosaicComponent.libMosaicZeroStateMod.MosaicZeroState[T] {
    def this(props: MosaicZeroStateProps[T]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicZeroStateProps[T], context: Any) = this()
  }
  /* static members */
  object MosaicZeroState {
    
    @JSImport("react-mosaic-component", "MosaicZeroState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component", "MosaicZeroState.contextType")
    @js.native
    def contextType: Context[typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicContext[MosaicKey]] = js.native
    inline def contextType_=(x: Context[typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicContext[MosaicKey]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-mosaic-component", "RemoveButton")
  @js.native
  open class RemoveButton protected ()
    extends typingsJapgolly.reactMosaicComponent.libButtonsRemoveButtonMod.RemoveButton {
    def this(props: MosaicButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicButtonProps, context: Any) = this()
  }
  /* static members */
  object RemoveButton {
    
    @JSImport("react-mosaic-component", "RemoveButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component", "RemoveButton.contextType")
    @js.native
    def contextType: Context[typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicWindowContext] = js.native
    inline def contextType_=(x: Context[typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicWindowContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-mosaic-component", "ReplaceButton")
  @js.native
  open class ReplaceButton protected ()
    extends typingsJapgolly.reactMosaicComponent.libButtonsReplaceButtonMod.ReplaceButton {
    def this(props: MosaicButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicButtonProps, context: Any) = this()
  }
  /* static members */
  object ReplaceButton {
    
    @JSImport("react-mosaic-component", "ReplaceButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component", "ReplaceButton.contextType")
    @js.native
    def contextType: Context[typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicWindowContext] = js.native
    inline def contextType_=(x: Context[typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicWindowContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-mosaic-component", "Separator")
  @js.native
  open class Separator protected ()
    extends typingsJapgolly.reactMosaicComponent.libButtonsSeparatorMod.Separator {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: Any) = this()
  }
  
  @JSImport("react-mosaic-component", "SplitButton")
  @js.native
  open class SplitButton protected ()
    extends typingsJapgolly.reactMosaicComponent.libButtonsSplitButtonMod.SplitButton {
    def this(props: MosaicButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicButtonProps, context: Any) = this()
  }
  /* static members */
  object SplitButton {
    
    @JSImport("react-mosaic-component", "SplitButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component", "SplitButton.contextType")
    @js.native
    def contextType: Context[typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicWindowContext] = js.native
    inline def contextType_=(x: Context[typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicWindowContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  inline def buildSpecFromUpdate[T /* <: MosaicKey */](mosaicUpdate: MosaicUpdate[T]): MosaicUpdateSpec[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSpecFromUpdate")(mosaicUpdate.asInstanceOf[js.Any]).asInstanceOf[MosaicUpdateSpec[T]]
  
  inline def createBalancedTreeFromLeaves[T /* <: MosaicKey */](leaves: js.Array[MosaicNode[T]]): MosaicNode[T] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createBalancedTreeFromLeaves")(leaves.asInstanceOf[js.Any]).asInstanceOf[MosaicNode[T] | Null]
  inline def createBalancedTreeFromLeaves[T /* <: MosaicKey */](leaves: js.Array[MosaicNode[T]], startDirection: MosaicDirection): MosaicNode[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createBalancedTreeFromLeaves")(leaves.asInstanceOf[js.Any], startDirection.asInstanceOf[js.Any])).asInstanceOf[MosaicNode[T] | Null]
  
  inline def createDefaultToolbarButton(
    title: String,
    className: String,
    onClick: js.Function1[/* event */ ReactMouseEventFrom[Any & org.scalajs.dom.Element], Any]
  ): typingsJapgolly.react.mod.global.JSX.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultToolbarButton")(title.asInstanceOf[js.Any], className.asInstanceOf[js.Any], onClick.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  inline def createDefaultToolbarButton(
    title: String,
    className: String,
    onClick: js.Function1[/* event */ ReactMouseEventFrom[Any & org.scalajs.dom.Element], Any],
    text: String
  ): typingsJapgolly.react.mod.global.JSX.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultToolbarButton")(title.asInstanceOf[js.Any], className.asInstanceOf[js.Any], onClick.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  inline def createDragToUpdates[T /* <: MosaicKey */](
    root: MosaicNode[T],
    sourcePath: MosaicPath,
    destinationPath: MosaicPath,
    position: MosaicDropTargetPosition
  ): js.Array[MosaicUpdate[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDragToUpdates")(root.asInstanceOf[js.Any], sourcePath.asInstanceOf[js.Any], destinationPath.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Array[MosaicUpdate[T]]]
  
  inline def createExpandUpdate[T /* <: MosaicKey */](path: MosaicPath, percentage: Double): MosaicUpdate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createExpandUpdate")(path.asInstanceOf[js.Any], percentage.asInstanceOf[js.Any])).asInstanceOf[MosaicUpdate[T]]
  
  inline def createHideUpdate[T /* <: MosaicKey */](path: MosaicPath): MosaicUpdate[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHideUpdate")(path.asInstanceOf[js.Any]).asInstanceOf[MosaicUpdate[T]]
  
  inline def createRemoveUpdate[T /* <: MosaicKey */](root: Null, path: MosaicPath): MosaicUpdate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRemoveUpdate")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[MosaicUpdate[T]]
  inline def createRemoveUpdate[T /* <: MosaicKey */](root: MosaicNode[T], path: MosaicPath): MosaicUpdate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRemoveUpdate")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[MosaicUpdate[T]]
  
  inline def getAndAssertNodeAtPathExists[T /* <: MosaicKey */](tree: Null, path: MosaicPath): MosaicNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAndAssertNodeAtPathExists")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[MosaicNode[T]]
  inline def getAndAssertNodeAtPathExists[T /* <: MosaicKey */](tree: MosaicNode[T], path: MosaicPath): MosaicNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAndAssertNodeAtPathExists")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[MosaicNode[T]]
  
  inline def getLeaves[T /* <: MosaicKey */](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeaves")().asInstanceOf[js.Array[T]]
  inline def getLeaves[T /* <: MosaicKey */](tree: MosaicNode[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeaves")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def getNodeAtPath[T /* <: MosaicKey */](tree: Null, path: MosaicPath): MosaicNode[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtPath")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[MosaicNode[T] | Null]
  inline def getNodeAtPath[T /* <: MosaicKey */](tree: MosaicNode[T], path: MosaicPath): MosaicNode[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtPath")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[MosaicNode[T] | Null]
  
  inline def getOtherBranch(branch: MosaicBranch): MosaicBranch = ^.asInstanceOf[js.Dynamic].applyDynamic("getOtherBranch")(branch.asInstanceOf[js.Any]).asInstanceOf[MosaicBranch]
  
  inline def getOtherDirection(direction: MosaicDirection): MosaicDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("getOtherDirection")(direction.asInstanceOf[js.Any]).asInstanceOf[MosaicDirection]
  
  inline def getPathToCorner(tree: MosaicNode[Any], corner: Corner): MosaicPath = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathToCorner")(tree.asInstanceOf[js.Any], corner.asInstanceOf[js.Any])).asInstanceOf[MosaicPath]
  
  inline def isParent[T /* <: MosaicKey */](node: MosaicNode[T]): /* is react-mosaic-component.react-mosaic-component/lib/types.MosaicParent<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParent")(node.asInstanceOf[js.Any]).asInstanceOf[/* is react-mosaic-component.react-mosaic-component/lib/types.MosaicParent<T> */ Boolean]
  
  inline def updateTree[T /* <: MosaicKey */](root: MosaicNode[T], updates: js.Array[MosaicUpdate[T]]): MosaicNode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTree")(root.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[MosaicNode[T]]
}
