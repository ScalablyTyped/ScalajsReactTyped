package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blueprintjsCore.anon.PartialNonIdealStateProps
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.horizontal
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.vertical
import typingsJapgolly.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsNonIdealStateNonIdealStateMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/non-ideal-state/nonIdealState", "NonIdealState")
  @js.native
  open class NonIdealState protected ()
    extends AbstractPureComponent2[NonIdealStateProps, js.Object, js.Object] {
    def this(props: NonIdealStateProps) = this()
    def this(props: NonIdealStateProps, context: Any) = this()
    
    /* private */ var maybeRenderText: Any = js.native
    
    /* private */ var maybeRenderVisual: Any = js.native
  }
  /* static members */
  object NonIdealState {
    
    @JSImport("@blueprintjs/core/lib/esm/components/non-ideal-state/nonIdealState", "NonIdealState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/non-ideal-state/nonIdealState", "NonIdealState.defaultProps")
    @js.native
    def defaultProps: PartialNonIdealStateProps = js.native
    inline def defaultProps_=(x: PartialNonIdealStateProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/non-ideal-state/nonIdealState", "NonIdealState.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait NonIdealStateIconSize extends StObject
  @JSImport("@blueprintjs/core/lib/esm/components/non-ideal-state/nonIdealState", "NonIdealStateIconSize")
  @js.native
  object NonIdealStateIconSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NonIdealStateIconSize & Double] = js.native
    
    @js.native
    sealed trait EXTRA_SMALL
      extends StObject
         with NonIdealStateIconSize
    /* 20 */ val EXTRA_SMALL: typingsJapgolly.blueprintjsCore.libEsmComponentsNonIdealStateNonIdealStateMod.NonIdealStateIconSize.EXTRA_SMALL & Double = js.native
    
    @js.native
    sealed trait SMALL
      extends StObject
         with NonIdealStateIconSize
    /* 32 */ val SMALL: typingsJapgolly.blueprintjsCore.libEsmComponentsNonIdealStateNonIdealStateMod.NonIdealStateIconSize.SMALL & Double = js.native
    
    @js.native
    sealed trait STANDARD
      extends StObject
         with NonIdealStateIconSize
    /* 48 */ val STANDARD: typingsJapgolly.blueprintjsCore.libEsmComponentsNonIdealStateNonIdealStateMod.NonIdealStateIconSize.STANDARD & Double = js.native
  }
  
  trait INonIdealStateProps
    extends StObject
       with IProps {
    
    /** An action to resolve the non-ideal state which appears after `description`. */
    var action: js.UndefOr[Element] = js.undefined
    
    /**
      * Advanced usage: React `children` will appear last (after `action`).
      * Avoid passing raw strings as they will not receive margins and disrupt the layout flow.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * A longer description of the non-ideal state.
      * A string or number value will be wrapped in a `<div>` to preserve margins.
      */
    var description: js.UndefOr[ReactChild] = js.undefined
    
    /** The name of a Blueprint icon or a JSX Element (such as `<Spinner/>`) to render above the title. */
    var icon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
    
    /**
      * How large the icon visual should be.
      *
      * @default NonIdealStateIconSize.STANDARD
      */
    var iconSize: js.UndefOr[NonIdealStateIconSize] = js.undefined
    
    /**
      * Component layout, either vertical or horizontal.
      *
      * @default "vertical"
      */
    var layout: js.UndefOr[vertical | horizontal] = js.undefined
    
    /** The title of the non-ideal state. */
    var title: js.UndefOr[Node] = js.undefined
  }
  object INonIdealStateProps {
    
    inline def apply(): INonIdealStateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INonIdealStateProps]
    }
    
    extension [Self <: INonIdealStateProps](x: Self) {
      
      inline def setAction(value: VdomElement): Self = StObject.set(x, "action", value.rawElement.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDescription(value: ReactChild): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "description", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconSize(value: NonIdealStateIconSize): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLayout(value: vertical | horizontal): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type NonIdealStateProps = INonIdealStateProps
}
