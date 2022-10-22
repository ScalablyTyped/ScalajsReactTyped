package typingsJapgolly.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.officeUiFabricReact.anon.PartialIBaseButtonProps
import typingsJapgolly.officeUiFabricReact.libComponentsButtonBaseButtonMod.IBaseButtonProps
import typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonStyles
import typingsJapgolly.officeUiFabricReact.libComponentsButtonSplitButtonSplitButtonDotclassNamesMod.ISplitButtonClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonMod {
  
  @JSImport("office-ui-fabric-react/lib/Button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/Button", "ActionButton")
  @js.native
  open class ActionButton protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsButtonMod.ActionButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Button", "BaseButton")
  @js.native
  open class BaseButton protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsButtonMod.BaseButton {
    def this(props: IBaseButtonProps) = this()
  }
  /* static members */
  object BaseButton {
    
    @JSImport("office-ui-fabric-react/lib/Button", "BaseButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Button", "BaseButton.defaultProps")
    @js.native
    def defaultProps: PartialIBaseButtonProps = js.native
    inline def defaultProps_=(x: PartialIBaseButtonProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Button", "Button")
  @js.native
  open class Button protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsButtonMod.Button {
    def this(props: IButtonProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Button", "ButtonType")
  @js.native
  object ButtonType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType & Double
      ] = js.native
    
    /* 6 */ val default: typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.default & Double = js.native
    
    /* 4 */ val command: typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.command & Double = js.native
    
    /* 3 */ val compound: typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.compound & Double = js.native
    
    /* 2 */ val hero: typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.hero & Double = js.native
    
    /* 5 */ val icon: typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.icon & Double = js.native
    
    /* 0 */ val normal: typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.normal & Double = js.native
    
    /* 1 */ val primary: typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ButtonType.primary & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Button", "CommandBarButton")
  @js.native
  open class CommandBarButton protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsButtonMod.CommandBarButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("office-ui-fabric-react/lib/Button", "CommandButton")
  @js.native
  open class CommandButton ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsButtonActionButtonActionButtonMod.ActionButton
  @JSImport("office-ui-fabric-react/lib/Button", "CommandButton")
  @js.native
  val CommandButton: Instantiable0[
    typingsJapgolly.officeUiFabricReact.libComponentsButtonActionButtonActionButtonMod.ActionButton
  ] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Button", "CompoundButton")
  @js.native
  open class CompoundButton protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsButtonMod.CompoundButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Button", "DefaultButton")
  @js.native
  open class DefaultButton protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsButtonMod.DefaultButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Button", "ElementType")
  @js.native
  object ElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ElementType & Double
      ] = js.native
    
    /* 1 */ val anchor: typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ElementType.anchor & Double = js.native
    
    /* 0 */ val button: typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.ElementType.button & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Button", "IconButton")
  @js.native
  open class IconButton protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsButtonMod.IconButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Button", "MessageBarButton")
  @js.native
  open class MessageBarButton protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsButtonMod.MessageBarButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Button", "PrimaryButton")
  @js.native
  open class PrimaryButton protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsButtonMod.PrimaryButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: Any) = this()
  }
  
  inline def getSplitButtonClassNames(styles: IButtonStyles, disabled: Boolean, expanded: Boolean, checked: Boolean): ISplitButtonClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplitButtonClassNames")(styles.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], expanded.asInstanceOf[js.Any], checked.asInstanceOf[js.Any])).asInstanceOf[ISplitButtonClassNames]
  inline def getSplitButtonClassNames(
    styles: IButtonStyles,
    disabled: Boolean,
    expanded: Boolean,
    checked: Boolean,
    primaryDisabled: Boolean
  ): ISplitButtonClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplitButtonClassNames")(styles.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], expanded.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], primaryDisabled.asInstanceOf[js.Any])).asInstanceOf[ISplitButtonClassNames]
}
