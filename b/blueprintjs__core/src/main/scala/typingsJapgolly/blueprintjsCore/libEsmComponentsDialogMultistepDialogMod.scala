package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsCore.anon.PartialMultistepDialogPro
import typingsJapgolly.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typingsJapgolly.blueprintjsCore.libEsmComponentsDialogDialogMod.IDialogProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsDialogDialogStepButtonMod.DialogStepButtonProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsDialogDialogStepMod.DialogStepId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsDialogMultistepDialogMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/dialog/multistepDialog", "MultistepDialog")
  @js.native
  open class MultistepDialog protected ()
    extends AbstractPureComponent2[MultistepDialogProps, IMultistepDialogState, js.Object] {
    def this(props: MultistepDialogProps) = this()
    def this(props: MultistepDialogProps, context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMultistepDialog(prevProps: MultistepDialogProps): Unit = js.native
    
    /* private */ var getDialogStepChangeHandler: Any = js.native
    
    /** Filters children to only `<DialogStep>`s */
    /* private */ var getDialogStepChildren: Any = js.native
    
    /* private */ var getDialogStyle: Any = js.native
    
    /* private */ var getInitialIndexFromProps: Any = js.native
    
    /* private */ var handleClickDialogStep: Any = js.native
    
    /* private */ var maybeRenderRightPanel: Any = js.native
    
    /* private */ var renderButtons: Any = js.native
    
    /* private */ var renderDialogStep: Any = js.native
    
    /* private */ var renderFooter: Any = js.native
    
    /* private */ var renderLeftPanel: Any = js.native
  }
  /* static members */
  object MultistepDialog {
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/multistepDialog", "MultistepDialog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/multistepDialog", "MultistepDialog.defaultProps")
    @js.native
    def defaultProps: PartialMultistepDialogPro = js.native
    inline def defaultProps_=(x: PartialMultistepDialogPro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/dialog/multistepDialog", "MultistepDialog.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IMultistepDialogProps
    extends StObject
       with IDialogProps {
    
    /**
      * Props for the back button.
      */
    var backButtonProps: js.UndefOr[DialogStepButtonProps] = js.undefined
    
    /**
      * Props for the close button that appears in the footer when there is no title.
      */
    var closeButtonProps: js.UndefOr[DialogStepButtonProps] = js.undefined
    
    /**
      * Props for the button to display on the final step.
      */
    var finalButtonProps: js.UndefOr[DialogStepButtonProps] = js.undefined
    
    /**
      * A 0 indexed initial step to start off on, to start in the middle of the dialog, for example.
      * If the provided index exceeds the number of steps, it defaults to the last step.
      * If a negative index is provided, it defaults to the first step.
      */
    var initialStepIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Position of the step navigation within the dialog.
      *
      * @default "left"
      */
    var navigationPosition: js.UndefOr[MultistepDialogNavPosition] = js.undefined
    
    /**
      * Props for the next button.
      */
    var nextButtonProps: js.UndefOr[DialogStepButtonProps] = js.undefined
    
    /**
      * A callback that is invoked when the user selects a different step by clicking on back, next, or a step itself.
      */
    var onChange: js.UndefOr[
        js.Function3[
          /* newDialogStepId */ DialogStepId, 
          /* prevDialogStepId */ js.UndefOr[DialogStepId], 
          /* event */ ReactMouseEventFrom[HTMLElement], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Whether to reset the dialog state to its initial state on close.
      * By default, closing the dialog will reset its state.
      *
      * @default true
      */
    var resetOnClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the footer close button is shown. The button will only appear if
      * `isCloseButtonShown` is `true`. The close button in the dialog title will
      * not be shown when this is `true`.
      *
      * @default false
      */
    var showCloseButtonInFooter: js.UndefOr[Boolean] = js.undefined
  }
  object IMultistepDialogProps {
    
    inline def apply(isOpen: Boolean): IMultistepDialogProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMultistepDialogProps]
    }
    
    extension [Self <: IMultistepDialogProps](x: Self) {
      
      inline def setBackButtonProps(value: DialogStepButtonProps): Self = StObject.set(x, "backButtonProps", value.asInstanceOf[js.Any])
      
      inline def setBackButtonPropsUndefined: Self = StObject.set(x, "backButtonProps", js.undefined)
      
      inline def setCloseButtonProps(value: DialogStepButtonProps): Self = StObject.set(x, "closeButtonProps", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonPropsUndefined: Self = StObject.set(x, "closeButtonProps", js.undefined)
      
      inline def setFinalButtonProps(value: DialogStepButtonProps): Self = StObject.set(x, "finalButtonProps", value.asInstanceOf[js.Any])
      
      inline def setFinalButtonPropsUndefined: Self = StObject.set(x, "finalButtonProps", js.undefined)
      
      inline def setInitialStepIndex(value: Double): Self = StObject.set(x, "initialStepIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialStepIndexUndefined: Self = StObject.set(x, "initialStepIndex", js.undefined)
      
      inline def setNavigationPosition(value: MultistepDialogNavPosition): Self = StObject.set(x, "navigationPosition", value.asInstanceOf[js.Any])
      
      inline def setNavigationPositionUndefined: Self = StObject.set(x, "navigationPosition", js.undefined)
      
      inline def setNextButtonProps(value: DialogStepButtonProps): Self = StObject.set(x, "nextButtonProps", value.asInstanceOf[js.Any])
      
      inline def setNextButtonPropsUndefined: Self = StObject.set(x, "nextButtonProps", js.undefined)
      
      inline def setOnChange(
        value: (/* newDialogStepId */ DialogStepId, /* prevDialogStepId */ js.UndefOr[DialogStepId], /* event */ ReactMouseEventFrom[HTMLElement]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* newDialogStepId */ DialogStepId, t1: /* prevDialogStepId */ js.UndefOr[DialogStepId], t2: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setResetOnClose(value: Boolean): Self = StObject.set(x, "resetOnClose", value.asInstanceOf[js.Any])
      
      inline def setResetOnCloseUndefined: Self = StObject.set(x, "resetOnClose", js.undefined)
      
      inline def setShowCloseButtonInFooter(value: Boolean): Self = StObject.set(x, "showCloseButtonInFooter", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonInFooterUndefined: Self = StObject.set(x, "showCloseButtonInFooter", js.undefined)
    }
  }
  
  trait IMultistepDialogState extends StObject {
    
    var lastViewedIndex: Double
    
    var selectedIndex: Double
  }
  object IMultistepDialogState {
    
    inline def apply(lastViewedIndex: Double, selectedIndex: Double): IMultistepDialogState = {
      val __obj = js.Dynamic.literal(lastViewedIndex = lastViewedIndex.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMultistepDialogState]
    }
    
    extension [Self <: IMultistepDialogState](x: Self) {
      
      inline def setLastViewedIndex(value: Double): Self = StObject.set(x, "lastViewedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.top
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.left
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.right
  */
  trait MultistepDialogNavPosition extends StObject
  object MultistepDialogNavPosition {
    
    inline def left: typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.left = "left".asInstanceOf[typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.left]
    
    inline def right: typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.right = "right".asInstanceOf[typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.right]
    
    inline def top: typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.top = "top".asInstanceOf[typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.top]
  }
  
  type MultistepDialogProps = IMultistepDialogProps
}
