package typingsJapgolly.reactJsonView

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactJsonView.reactJsonViewBooleans.`false`
import typingsJapgolly.reactJsonView.reactJsonViewStrings.`object`
import typingsJapgolly.reactJsonView.reactJsonViewStrings.array
import typingsJapgolly.reactJsonView.reactJsonViewStrings.circle
import typingsJapgolly.reactJsonView.reactJsonViewStrings.square
import typingsJapgolly.reactJsonView.reactJsonViewStrings.triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-json-view", JSImport.Default)
  @js.native
  val default: ComponentType[ReactJsonViewProps] = js.native
  
  trait CollapsedFieldProps extends StObject {
    
    /**
      * The name of the entry.
      */
    var name: String | Null
    
    /**
      * The scopes above the current entry.
      */
    var namespace: js.Array[String | Null]
    
    /**
      * The corresponding JSON subtree.
      */
    var src: js.Object
    
    /**
      * The type of src. Can only be "array" or "object".
      */
    var `type`: array | `object`
  }
  object CollapsedFieldProps {
    
    inline def apply(namespace: js.Array[String | Null], src: js.Object, `type`: array | `object`): CollapsedFieldProps = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], name = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapsedFieldProps]
    }
    
    extension [Self <: CollapsedFieldProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNamespace(value: js.Array[String | Null]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceVarargs(value: (String | Null)*): Self = StObject.set(x, "namespace", js.Array(value*))
      
      inline def setSrc(value: js.Object): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setType(value: array | `object`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait InteractionProps extends StObject {
    
    /**
      * The existing subtree of the JSON tree.
      */
    var existing_src: js.Object
    
    /**
      * The original value of the entry that is interacted with.
      */
    var existing_value: js.Object | String | Double | Boolean | Null
    
    /**
      * The key of the entry that is interacted with.
      */
    var name: String | Null
    
    /**
      * List of keys.
      */
    var namespace: js.Array[String | Null]
    
    /**
      * The updated value of the entry that is interacted with.
      */
    var new_value: js.UndefOr[js.Object | String | Double | Boolean | Null] = js.undefined
    
    /**
      * The updated subtree of the JSON tree.
      */
    var updated_src: js.Object
  }
  object InteractionProps {
    
    inline def apply(existing_src: js.Object, namespace: js.Array[String | Null], updated_src: js.Object): InteractionProps = {
      val __obj = js.Dynamic.literal(existing_src = existing_src.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], updated_src = updated_src.asInstanceOf[js.Any], existing_value = null, name = null)
      __obj.asInstanceOf[InteractionProps]
    }
    
    extension [Self <: InteractionProps](x: Self) {
      
      inline def setExisting_src(value: js.Object): Self = StObject.set(x, "existing_src", value.asInstanceOf[js.Any])
      
      inline def setExisting_value(value: js.Object | String | Double | Boolean): Self = StObject.set(x, "existing_value", value.asInstanceOf[js.Any])
      
      inline def setExisting_valueNull: Self = StObject.set(x, "existing_value", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNamespace(value: js.Array[String | Null]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceVarargs(value: (String | Null)*): Self = StObject.set(x, "namespace", js.Array(value*))
      
      inline def setNew_value(value: js.Object | String | Double | Boolean): Self = StObject.set(x, "new_value", value.asInstanceOf[js.Any])
      
      inline def setNew_valueNull: Self = StObject.set(x, "new_value", null)
      
      inline def setNew_valueUndefined: Self = StObject.set(x, "new_value", js.undefined)
      
      inline def setUpdated_src(value: js.Object): Self = StObject.set(x, "updated_src", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnCopyProps extends StObject {
    
    /**
      * The last key in the namespace array.
      */
    var name: String | Null
    
    /**
      * List of keys.
      */
    var namespace: js.Array[String | Null]
    
    /**
      * The JSON tree source object
      */
    var src: js.Object
  }
  object OnCopyProps {
    
    inline def apply(namespace: js.Array[String | Null], src: js.Object): OnCopyProps = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], name = null)
      __obj.asInstanceOf[OnCopyProps]
    }
    
    extension [Self <: OnCopyProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNamespace(value: js.Array[String | Null]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceVarargs(value: (String | Null)*): Self = StObject.set(x, "namespace", js.Array(value*))
      
      inline def setSrc(value: js.Object): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnSelectProps extends StObject {
    
    /**
      * The name of the currently selected entry.
      */
    var name: String | Null
    
    /**
      * List of keys representing the scopes above the selected entry.
      */
    var namespace: js.Array[String | Null]
    
    /**
      * The type of the value. For "number" type, it will be replaced with the more
      * accurate types: "float", "integer", or "nan".
      */
    var `type`: String
    
    /**
      * The value of the currently selected entry.
      */
    var value: js.Object | String | Double | Boolean | Null
  }
  object OnSelectProps {
    
    inline def apply(namespace: js.Array[String | Null], `type`: String): OnSelectProps = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], name = null, value = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnSelectProps]
    }
    
    extension [Self <: OnSelectProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNamespace(value: js.Array[String | Null]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceVarargs(value: (String | Null)*): Self = StObject.set(x, "namespace", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Object | String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait ReactJsonViewProps extends StObject {
    
    /**
      * When an integer value is assigned, strings will be cut off at that length.
      * Collapsed strings are followed by an ellipsis.
      * String content can be expanded and collapsed by clicking on the string value.
      *
      * Default: false
      */
    var collapseStringsAfterLength: js.UndefOr[Double | `false`] = js.undefined
    
    /**
      * When set to true, all nodes will be collapsed by default.
      * Use an integer value to collapse at a particular depth.
      *
      * Default: false
      */
    var collapsed: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Set to a value to be used as defaultValue when adding new key to json
      *
      * Default: null
      */
    var defaultValue: js.UndefOr[TypeDefaultValue | js.Array[TypeDefaultValue] | Null] = js.undefined
    
    /**
      * When set to true, data type labels prefix values.
      *
      * Default: true
      */
    var displayDataTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When set to true, objects and arrays are labeled with size.
      *
      * Default: true
      */
    var displayObjectSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When prop is not false, the user can copy objects and arrays to clipboard by clicking on the clipboard icon.
      * Copy callbacks are supported.
      *
      * Default: true
      */
    var enableClipboard: js.UndefOr[Boolean | (js.Function1[/* copy */ OnCopyProps, Unit])] = js.undefined
    
    /**
      * When an integer value is assigned, arrays will be displayed in groups by count of the value.
      * Groups are displayed with brakcet notation and can be expanded and collapsed by clickong on the brackets.
      *
      * Default: 100
      */
    var groupArraysAfterLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Style of expand/collapse icons. Accepted values are "circle", triangle" or "square".
      *
      * Default: {}
      */
    var iconStyle: js.UndefOr[circle | triangle | square] = js.undefined
    
    /**
      * Set the indent-width for nested objects.
      *
      * Default: 4
      */
    var indentWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Contains the name of your root node. Use null or false for no name.
      *
      * Default: "root"
      */
    var name: js.UndefOr[String | Null | `false`] = js.undefined
    
    /**
      * When a callback function is passed in, add functionality is enabled.
      * The callback is invoked before additions are completed.
      * Returning false from onAdd will prevent the change from being made. see: onAdd docs
      *
      * Default: false
      */
    var onAdd: js.UndefOr[(js.Function1[/* add */ InteractionProps, `false` | Any]) | `false`] = js.undefined
    
    /**
      * When a callback function is passed in, delete functionality is enabled.
      * The callback is invoked before deletions are completed.
      * Returning false from onDelete will prevent the change from being made. see: onDelete docs
      *
      * Default: false
      */
    var onDelete: js.UndefOr[(js.Function1[/* del */ InteractionProps, `false` | Any]) | `false`] = js.undefined
    
    /**
      * When a callback function is passed in, edit functionality is enabled.
      * The callback is invoked before edits are completed. Returning false
      * from onEdit will prevent the change from being made. see: onEdit docs.
      *
      * Default: false
      */
    var onEdit: js.UndefOr[(js.Function1[/* edit */ InteractionProps, `false` | Any]) | `false`] = js.undefined
    
    /**
      * When a function is passed in, clicking a value triggers the onSelect method to be called.
      *
      * Default: false
      */
    var onSelect: js.UndefOr[(js.Function1[/* select */ OnSelectProps, Unit]) | `false`] = js.undefined
    
    /**
      * set to false to remove quotes from keys (eg. "name": vs. name:)
      *
      * Default: true
      */
    var quotesOnKeys: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback function to provide control over what objects and arrays should be collapsed by default.
      * An object is passed to the callback containing name, src, type ("array" or "object") and namespace.
      *
      * Default: false
      */
    var shouldCollapse: js.UndefOr[`false` | (js.Function1[/* field */ CollapsedFieldProps, Boolean])] = js.undefined
    
    /**
      * Set to true to sort object keys.
      *
      * Default: false
      */
    var sortKeys: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This property contains your input JSON.
      *
      * Required.
      */
    var src: js.Object
    
    /**
      * Style attributes for react-json-view container.
      * Explicit style attributes will override attributes provided by a theme.
      *
      * Default: "rjv-default"
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * RJV supports base-16 themes. Check out the list of supported themes in the demo.
      * A custom "rjv-default" theme applies by default.
      *
      * Default: "rjv-default"
      */
    var theme: js.UndefOr[ThemeKeys | ThemeObject] = js.undefined
    
    /**
      * Custom message for validation failures to onEdit, onAdd, or onDelete callbacks.
      *
      * Default: "Validation Error"
      */
    var validationMessage: js.UndefOr[String] = js.undefined
  }
  object ReactJsonViewProps {
    
    inline def apply(src: js.Object): ReactJsonViewProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactJsonViewProps]
    }
    
    extension [Self <: ReactJsonViewProps](x: Self) {
      
      inline def setCollapseStringsAfterLength(value: Double | `false`): Self = StObject.set(x, "collapseStringsAfterLength", value.asInstanceOf[js.Any])
      
      inline def setCollapseStringsAfterLengthUndefined: Self = StObject.set(x, "collapseStringsAfterLength", js.undefined)
      
      inline def setCollapsed(value: Boolean | Double): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setDefaultValue(value: TypeDefaultValue | js.Array[TypeDefaultValue]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: TypeDefaultValue*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDisplayDataTypes(value: Boolean): Self = StObject.set(x, "displayDataTypes", value.asInstanceOf[js.Any])
      
      inline def setDisplayDataTypesUndefined: Self = StObject.set(x, "displayDataTypes", js.undefined)
      
      inline def setDisplayObjectSize(value: Boolean): Self = StObject.set(x, "displayObjectSize", value.asInstanceOf[js.Any])
      
      inline def setDisplayObjectSizeUndefined: Self = StObject.set(x, "displayObjectSize", js.undefined)
      
      inline def setEnableClipboard(value: Boolean | (js.Function1[/* copy */ OnCopyProps, Unit])): Self = StObject.set(x, "enableClipboard", value.asInstanceOf[js.Any])
      
      inline def setEnableClipboardFunction1(value: /* copy */ OnCopyProps => Callback): Self = StObject.set(x, "enableClipboard", js.Any.fromFunction1((t0: /* copy */ OnCopyProps) => value(t0).runNow()))
      
      inline def setEnableClipboardUndefined: Self = StObject.set(x, "enableClipboard", js.undefined)
      
      inline def setGroupArraysAfterLength(value: Double): Self = StObject.set(x, "groupArraysAfterLength", value.asInstanceOf[js.Any])
      
      inline def setGroupArraysAfterLengthUndefined: Self = StObject.set(x, "groupArraysAfterLength", js.undefined)
      
      inline def setIconStyle(value: circle | triangle | square): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
      
      inline def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
      
      inline def setName(value: String | `false`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnAdd(value: (js.Function1[/* add */ InteractionProps, `false` | Any]) | `false`): Self = StObject.set(x, "onAdd", value.asInstanceOf[js.Any])
      
      inline def setOnAddFunction1(value: /* add */ InteractionProps => `false` | Any): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnDelete(value: (js.Function1[/* del */ InteractionProps, `false` | Any]) | `false`): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      inline def setOnDeleteFunction1(value: /* del */ InteractionProps => `false` | Any): Self = StObject.set(x, "onDelete", js.Any.fromFunction1(value))
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setOnEdit(value: (js.Function1[/* edit */ InteractionProps, `false` | Any]) | `false`): Self = StObject.set(x, "onEdit", value.asInstanceOf[js.Any])
      
      inline def setOnEditFunction1(value: /* edit */ InteractionProps => `false` | Any): Self = StObject.set(x, "onEdit", js.Any.fromFunction1(value))
      
      inline def setOnEditUndefined: Self = StObject.set(x, "onEdit", js.undefined)
      
      inline def setOnSelect(value: (js.Function1[/* select */ OnSelectProps, Unit]) | `false`): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectFunction1(value: /* select */ OnSelectProps => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* select */ OnSelectProps) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setQuotesOnKeys(value: Boolean): Self = StObject.set(x, "quotesOnKeys", value.asInstanceOf[js.Any])
      
      inline def setQuotesOnKeysUndefined: Self = StObject.set(x, "quotesOnKeys", js.undefined)
      
      inline def setShouldCollapse(value: `false` | (js.Function1[/* field */ CollapsedFieldProps, Boolean])): Self = StObject.set(x, "shouldCollapse", value.asInstanceOf[js.Any])
      
      inline def setShouldCollapseFunction1(value: /* field */ CollapsedFieldProps => Boolean): Self = StObject.set(x, "shouldCollapse", js.Any.fromFunction1(value))
      
      inline def setShouldCollapseUndefined: Self = StObject.set(x, "shouldCollapse", js.undefined)
      
      inline def setSortKeys(value: Boolean): Self = StObject.set(x, "sortKeys", value.asInstanceOf[js.Any])
      
      inline def setSortKeysUndefined: Self = StObject.set(x, "sortKeys", js.undefined)
      
      inline def setSrc(value: js.Object): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: ThemeKeys | ThemeObject): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setValidationMessage(value: String): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      inline def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.apathy
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.apathyColoninverted
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.ashes
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.bespin
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.brewer
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.brightColoninverted
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.bright
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.chalk
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.codeschool
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.colors
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.eighties
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.embers
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.flat
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.google
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.grayscale
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.grayscaleColoninverted
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.greenscreen
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.harmonic
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.hopscotch
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.isotope
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.marrakesh
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.mocha
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.monokai
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.ocean
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.paraiso
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.pop
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.railscasts
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.`rjv-default`
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.shapeshifter
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.shapeshifterColoninverted
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.solarized
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.summerfruit
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.summerfruitColoninverted
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.threezerotwofour
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.tomorrow
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.tube
    - typingsJapgolly.reactJsonView.reactJsonViewStrings.twilight
  */
  trait ThemeKeys extends StObject
  object ThemeKeys {
    
    inline def apathy: typingsJapgolly.reactJsonView.reactJsonViewStrings.apathy = "apathy".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.apathy]
    
    inline def apathyColoninverted: typingsJapgolly.reactJsonView.reactJsonViewStrings.apathyColoninverted = "apathy:inverted".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.apathyColoninverted]
    
    inline def ashes: typingsJapgolly.reactJsonView.reactJsonViewStrings.ashes = "ashes".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.ashes]
    
    inline def bespin: typingsJapgolly.reactJsonView.reactJsonViewStrings.bespin = "bespin".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.bespin]
    
    inline def brewer: typingsJapgolly.reactJsonView.reactJsonViewStrings.brewer = "brewer".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.brewer]
    
    inline def bright: typingsJapgolly.reactJsonView.reactJsonViewStrings.bright = "bright".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.bright]
    
    inline def brightColoninverted: typingsJapgolly.reactJsonView.reactJsonViewStrings.brightColoninverted = "bright:inverted".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.brightColoninverted]
    
    inline def chalk: typingsJapgolly.reactJsonView.reactJsonViewStrings.chalk = "chalk".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.chalk]
    
    inline def codeschool: typingsJapgolly.reactJsonView.reactJsonViewStrings.codeschool = "codeschool".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.codeschool]
    
    inline def colors: typingsJapgolly.reactJsonView.reactJsonViewStrings.colors = "colors".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.colors]
    
    inline def eighties: typingsJapgolly.reactJsonView.reactJsonViewStrings.eighties = "eighties".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.eighties]
    
    inline def embers: typingsJapgolly.reactJsonView.reactJsonViewStrings.embers = "embers".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.embers]
    
    inline def flat: typingsJapgolly.reactJsonView.reactJsonViewStrings.flat = "flat".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.flat]
    
    inline def google: typingsJapgolly.reactJsonView.reactJsonViewStrings.google = "google".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.google]
    
    inline def grayscale: typingsJapgolly.reactJsonView.reactJsonViewStrings.grayscale = "grayscale".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.grayscale]
    
    inline def grayscaleColoninverted: typingsJapgolly.reactJsonView.reactJsonViewStrings.grayscaleColoninverted = "grayscale:inverted".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.grayscaleColoninverted]
    
    inline def greenscreen: typingsJapgolly.reactJsonView.reactJsonViewStrings.greenscreen = "greenscreen".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.greenscreen]
    
    inline def harmonic: typingsJapgolly.reactJsonView.reactJsonViewStrings.harmonic = "harmonic".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.harmonic]
    
    inline def hopscotch: typingsJapgolly.reactJsonView.reactJsonViewStrings.hopscotch = "hopscotch".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.hopscotch]
    
    inline def isotope: typingsJapgolly.reactJsonView.reactJsonViewStrings.isotope = "isotope".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.isotope]
    
    inline def marrakesh: typingsJapgolly.reactJsonView.reactJsonViewStrings.marrakesh = "marrakesh".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.marrakesh]
    
    inline def mocha: typingsJapgolly.reactJsonView.reactJsonViewStrings.mocha = "mocha".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.mocha]
    
    inline def monokai: typingsJapgolly.reactJsonView.reactJsonViewStrings.monokai = "monokai".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.monokai]
    
    inline def ocean: typingsJapgolly.reactJsonView.reactJsonViewStrings.ocean = "ocean".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.ocean]
    
    inline def paraiso: typingsJapgolly.reactJsonView.reactJsonViewStrings.paraiso = "paraiso".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.paraiso]
    
    inline def pop: typingsJapgolly.reactJsonView.reactJsonViewStrings.pop = "pop".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.pop]
    
    inline def railscasts: typingsJapgolly.reactJsonView.reactJsonViewStrings.railscasts = "railscasts".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.railscasts]
    
    inline def `rjv-default`: typingsJapgolly.reactJsonView.reactJsonViewStrings.`rjv-default` = "rjv-default".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.`rjv-default`]
    
    inline def shapeshifter: typingsJapgolly.reactJsonView.reactJsonViewStrings.shapeshifter = "shapeshifter".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.shapeshifter]
    
    inline def shapeshifterColoninverted: typingsJapgolly.reactJsonView.reactJsonViewStrings.shapeshifterColoninverted = "shapeshifter:inverted".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.shapeshifterColoninverted]
    
    inline def solarized: typingsJapgolly.reactJsonView.reactJsonViewStrings.solarized = "solarized".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.solarized]
    
    inline def summerfruit: typingsJapgolly.reactJsonView.reactJsonViewStrings.summerfruit = "summerfruit".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.summerfruit]
    
    inline def summerfruitColoninverted: typingsJapgolly.reactJsonView.reactJsonViewStrings.summerfruitColoninverted = "summerfruit:inverted".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.summerfruitColoninverted]
    
    inline def threezerotwofour: typingsJapgolly.reactJsonView.reactJsonViewStrings.threezerotwofour = "threezerotwofour".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.threezerotwofour]
    
    inline def tomorrow: typingsJapgolly.reactJsonView.reactJsonViewStrings.tomorrow = "tomorrow".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.tomorrow]
    
    inline def tube: typingsJapgolly.reactJsonView.reactJsonViewStrings.tube = "tube".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.tube]
    
    inline def twilight: typingsJapgolly.reactJsonView.reactJsonViewStrings.twilight = "twilight".asInstanceOf[typingsJapgolly.reactJsonView.reactJsonViewStrings.twilight]
  }
  
  trait ThemeObject extends StObject {
    
    var base00: String
    
    var base01: String
    
    var base02: String
    
    var base03: String
    
    var base04: String
    
    var base05: String
    
    var base06: String
    
    var base07: String
    
    var base08: String
    
    var base09: String
    
    var base0A: String
    
    var base0B: String
    
    var base0C: String
    
    var base0D: String
    
    var base0E: String
    
    var base0F: String
  }
  object ThemeObject {
    
    inline def apply(
      base00: String,
      base01: String,
      base02: String,
      base03: String,
      base04: String,
      base05: String,
      base06: String,
      base07: String,
      base08: String,
      base09: String,
      base0A: String,
      base0B: String,
      base0C: String,
      base0D: String,
      base0E: String,
      base0F: String
    ): ThemeObject = {
      val __obj = js.Dynamic.literal(base00 = base00.asInstanceOf[js.Any], base01 = base01.asInstanceOf[js.Any], base02 = base02.asInstanceOf[js.Any], base03 = base03.asInstanceOf[js.Any], base04 = base04.asInstanceOf[js.Any], base05 = base05.asInstanceOf[js.Any], base06 = base06.asInstanceOf[js.Any], base07 = base07.asInstanceOf[js.Any], base08 = base08.asInstanceOf[js.Any], base09 = base09.asInstanceOf[js.Any], base0A = base0A.asInstanceOf[js.Any], base0B = base0B.asInstanceOf[js.Any], base0C = base0C.asInstanceOf[js.Any], base0D = base0D.asInstanceOf[js.Any], base0E = base0E.asInstanceOf[js.Any], base0F = base0F.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeObject]
    }
    
    extension [Self <: ThemeObject](x: Self) {
      
      inline def setBase00(value: String): Self = StObject.set(x, "base00", value.asInstanceOf[js.Any])
      
      inline def setBase01(value: String): Self = StObject.set(x, "base01", value.asInstanceOf[js.Any])
      
      inline def setBase02(value: String): Self = StObject.set(x, "base02", value.asInstanceOf[js.Any])
      
      inline def setBase03(value: String): Self = StObject.set(x, "base03", value.asInstanceOf[js.Any])
      
      inline def setBase04(value: String): Self = StObject.set(x, "base04", value.asInstanceOf[js.Any])
      
      inline def setBase05(value: String): Self = StObject.set(x, "base05", value.asInstanceOf[js.Any])
      
      inline def setBase06(value: String): Self = StObject.set(x, "base06", value.asInstanceOf[js.Any])
      
      inline def setBase07(value: String): Self = StObject.set(x, "base07", value.asInstanceOf[js.Any])
      
      inline def setBase08(value: String): Self = StObject.set(x, "base08", value.asInstanceOf[js.Any])
      
      inline def setBase09(value: String): Self = StObject.set(x, "base09", value.asInstanceOf[js.Any])
      
      inline def setBase0A(value: String): Self = StObject.set(x, "base0A", value.asInstanceOf[js.Any])
      
      inline def setBase0B(value: String): Self = StObject.set(x, "base0B", value.asInstanceOf[js.Any])
      
      inline def setBase0C(value: String): Self = StObject.set(x, "base0C", value.asInstanceOf[js.Any])
      
      inline def setBase0D(value: String): Self = StObject.set(x, "base0D", value.asInstanceOf[js.Any])
      
      inline def setBase0E(value: String): Self = StObject.set(x, "base0E", value.asInstanceOf[js.Any])
      
      inline def setBase0F(value: String): Self = StObject.set(x, "base0F", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeDefaultValue = String | Double | Boolean | js.Object
  
  type _To = ComponentType[ReactJsonViewProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentType[ReactJsonViewProps] = default
}
