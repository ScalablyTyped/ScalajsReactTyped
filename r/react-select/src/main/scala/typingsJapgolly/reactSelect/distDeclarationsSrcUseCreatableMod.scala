package typingsJapgolly.reactSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.PublicBaseSelectProps
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GetOptionLabel
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GetOptionValue
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.Options
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.OptionsOrGroups
import typingsJapgolly.reactSelect.reactSelectStrings.first
import typingsJapgolly.reactSelect.reactSelectStrings.last
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcUseCreatableMod {
  
  @JSImport("react-select/dist/declarations/src/useCreatable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](
    hasAllowCreateWhileLoadingCreateOptionPositionFormatCreateLabelIsValidNewOptionGetNewOptionDataOnCreateOptionPropsOptionsPropsOnChangeRestSelectProps: BaseCreatableProps[Option, IsMulti, Group]
  ): PublicBaseSelectProps[Option, IsMulti, Group] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasAllowCreateWhileLoadingCreateOptionPositionFormatCreateLabelIsValidNewOptionGetNewOptionDataOnCreateOptionPropsOptionsPropsOnChangeRestSelectProps.asInstanceOf[js.Any]).asInstanceOf[PublicBaseSelectProps[Option, IsMulti, Group]]
  
  trait Accessors[Option] extends StObject {
    
    var getOptionLabel: GetOptionLabel[Option]
    
    var getOptionValue: GetOptionValue[Option]
  }
  object Accessors {
    
    inline def apply[Option](getOptionLabel: Option => String, getOptionValue: Option => String): Accessors[Option] = {
      val __obj = js.Dynamic.literal(getOptionLabel = js.Any.fromFunction1(getOptionLabel), getOptionValue = js.Any.fromFunction1(getOptionValue))
      __obj.asInstanceOf[Accessors[Option]]
    }
    
    extension [Self <: Accessors[?], Option](x: Self & Accessors[Option]) {
      
      inline def setGetOptionLabel(value: Option => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
      inline def setGetOptionValue(value: Option => String): Self = StObject.set(x, "getOptionValue", js.Any.fromFunction1(value))
    }
  }
  
  type BaseCreatableProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (PublicBaseSelectProps[Option, IsMulti, Group]) & (CreatableAdditionalProps[Option, Group])
  
  trait CreatableAdditionalProps[Option, Group /* <: GroupBase[Option] */] extends StObject {
    
    /**
      * Allow options to be created while the `isLoading` prop is true. Useful to
      * prevent the "create new ..." option being displayed while async results are
      * still being loaded.
      */
    var allowCreateWhileLoading: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the position of the createOption element in your options list. Defaults to 'last' */
    var createOptionPosition: js.UndefOr[first | last] = js.undefined
    
    /**
      * Gets the label for the "create new ..." option in the menu. Is given the
      * current input value.
      */
    var formatCreateLabel: js.UndefOr[js.Function1[/* inputValue */ String, Node]] = js.undefined
    
    /**
      * Returns the data for the new option when it is created. Used to display the
      * value, and is passed to `onChange`.
      */
    var getNewOptionData: js.UndefOr[js.Function2[/* inputValue */ String, /* optionLabel */ Node, Option]] = js.undefined
    
    /**
      * Determines whether the "create new ..." option should be displayed based on
      * the current input value, select value and options array.
      */
    var isValidNewOption: js.UndefOr[
        js.Function4[
          /* inputValue */ String, 
          /* value */ Options[Option], 
          /* options */ OptionsOrGroups[Option, Group], 
          /* accessors */ Accessors[Option], 
          Boolean
        ]
      ] = js.undefined
    
    /**
      * If provided, this will be called with the input value when a new option is
      * created, and `onChange` will **not** be called. Use this when you need more
      * control over what happens when new options are created.
      */
    var onCreateOption: js.UndefOr[js.Function1[/* inputValue */ String, Unit]] = js.undefined
  }
  object CreatableAdditionalProps {
    
    inline def apply[Option, Group /* <: GroupBase[Option] */](): CreatableAdditionalProps[Option, Group] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreatableAdditionalProps[Option, Group]]
    }
    
    extension [Self <: CreatableAdditionalProps[?, ?], Option, Group /* <: GroupBase[Option] */](x: Self & (CreatableAdditionalProps[Option, Group])) {
      
      inline def setAllowCreateWhileLoading(value: Boolean): Self = StObject.set(x, "allowCreateWhileLoading", value.asInstanceOf[js.Any])
      
      inline def setAllowCreateWhileLoadingUndefined: Self = StObject.set(x, "allowCreateWhileLoading", js.undefined)
      
      inline def setCreateOptionPosition(value: first | last): Self = StObject.set(x, "createOptionPosition", value.asInstanceOf[js.Any])
      
      inline def setCreateOptionPositionUndefined: Self = StObject.set(x, "createOptionPosition", js.undefined)
      
      inline def setFormatCreateLabel(value: /* inputValue */ String => Node): Self = StObject.set(x, "formatCreateLabel", js.Any.fromFunction1(value))
      
      inline def setFormatCreateLabelUndefined: Self = StObject.set(x, "formatCreateLabel", js.undefined)
      
      inline def setGetNewOptionData(value: (/* inputValue */ String, /* optionLabel */ Node) => Option): Self = StObject.set(x, "getNewOptionData", js.Any.fromFunction2(value))
      
      inline def setGetNewOptionDataUndefined: Self = StObject.set(x, "getNewOptionData", js.undefined)
      
      inline def setIsValidNewOption(
        value: (/* inputValue */ String, /* value */ Options[Option], /* options */ OptionsOrGroups[Option, Group], /* accessors */ Accessors[Option]) => Boolean
      ): Self = StObject.set(x, "isValidNewOption", js.Any.fromFunction4(value))
      
      inline def setIsValidNewOptionUndefined: Self = StObject.set(x, "isValidNewOption", js.undefined)
      
      inline def setOnCreateOption(value: /* inputValue */ String => Callback): Self = StObject.set(x, "onCreateOption", js.Any.fromFunction1((t0: /* inputValue */ String) => value(t0).runNow()))
      
      inline def setOnCreateOptionUndefined: Self = StObject.set(x, "onCreateOption", js.undefined)
    }
  }
}
