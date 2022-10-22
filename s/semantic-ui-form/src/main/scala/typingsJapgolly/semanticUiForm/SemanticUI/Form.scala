package typingsJapgolly.semanticUiForm.SemanticUI

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiForm.JQuery
import typingsJapgolly.semanticUiForm.SemanticUI.Form.ClassNameSettings.Param
import typingsJapgolly.semanticUiForm.SemanticUI.Form.Fields
import typingsJapgolly.semanticUiForm.SemanticUI.Form.Rule
import typingsJapgolly.semanticUiForm.SemanticUI.Form.Rules
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`add errors`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`add field`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`add fields`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`add prompt`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`add rule`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`get change event`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`get field`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`get validation`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`get value`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`get values`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`has field`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`is valid`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`remove field`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`remove fields`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`remove rule`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`remove rules`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`set value`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`set values`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.`validate form`
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.destroy
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.setting
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Form extends StObject {
  
  def apply(): JQuery = js.native
  /**
    * Adds errors to form, given an array errors
    */
  def apply(behavior: `add errors`, errors: js.Array[String]): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  def apply(behavior: `add field`, field: String, rules: String): JQuery = js.native
  def apply(behavior: `add field`, field: String, rules: js.Array[String]): JQuery = js.native
  def apply(behavior: `add field`, field: String, rules: Rules): JQuery = js.native
  /**
    * Adds fields object to existing fields
    * @since 2.2.11
    */
  def apply(behavior: `add fields`, fields: Fields): JQuery = js.native
  /**
    * Adds error prompt to the field with the given identifier
    */
  def apply(behavior: `add prompt`, identifier: String, errors: String): JQuery = js.native
  def apply(behavior: `add prompt`, identifier: String, errors: js.Array[String]): JQuery = js.native
  /**
    * Adds rule to existing rules for field
    * @since 2.2.11
    */
  def apply(behavior: `add rule`, field: String, rules: String): JQuery = js.native
  def apply(behavior: `add rule`, field: String, rules: js.Array[String]): JQuery = js.native
  def apply(behavior: `add rule`, field: String, rules: Rules): JQuery = js.native
  /**
    * gets browser property change event
    */
  def apply(behavior: `get change event`): String = js.native
  /**
    * Returns element with matching name, id, or data-validate metadata to ID
    */
  def apply(behavior: `get field`, id: String): JQuery = js.native
  /**
    * Returns validation rules for a given jQuery-referenced input field
    */
  def apply(behavior: `get validation`, element: JQuery): Any = js.native
  /**
    * Returns value of element with id
    */
  def apply(behavior: `get value`, id: String): Any = js.native
  /**
    * Returns object of element values that match array of ids. If no IDS are passed will return all fields
    */
  def apply(behavior: `get values`): Any = js.native
  def apply(behavior: `get values`, ids: js.Array[String]): Any = js.native
  /**
    * Returns whether a field exists
    */
  def apply(behavior: `has field`, identifier: String): Boolean = js.native
  /**
    * Returns true/false whether a form passes its validation rules
    */
  def apply(behavior: `is valid`): Boolean = js.native
  /**
    * Returns true/false whether a field passes its validation rules
    */
  def apply(behavior: `is valid`, field: String): Boolean = js.native
  /**
    * Remove all validation for a field
    * @since 2.2.11
    */
  def apply(behavior: `remove field`, field: String): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `remove fields`, fields: js.Array[String]): JQuery = js.native
  /**
    * Removes specific rule from field leaving other rules
    * @since 2.2.11
    */
  def apply(behavior: `remove rule`, field: String, rule: Rule): JQuery = js.native
  /**
    * @since 2.2.11
    */
  def apply(behavior: `remove rules`, fields: String, rules: js.Array[Rule]): JQuery = js.native
  def apply(behavior: `remove rules`, fields: js.Array[String], rules: js.Array[Rule]): JQuery = js.native
  /**
    * Sets value of element with id
    */
  def apply(behavior: `set value`, id: String): JQuery = js.native
  /**
    * Sets key/value pairs from passed values object to matching ids
    */
  def apply(behavior: `set values`, values: Any): JQuery = js.native
  /**
    * Validates form and calls onSuccess or onFailure
    */
  def apply(behavior: `validate form`): JQuery = js.native
  def apply(behavior: destroy): JQuery = js.native
  def apply(behavior: setting, value: FormSettings): JQuery = js.native
  /**
    * Submits selected form
    */
  def apply(behavior: submit): JQuery = js.native
  def apply(settings: Fields): JQuery = js.native
  def apply(settings: FormSettings): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-form.SemanticUI.FormSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-form.SemanticUI.FormSettings._Impl[K] */ js.Any
  ): JQuery = js.native
  def apply[K /* <: /* keyof semantic-ui-form.SemanticUI.FormSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-form.SemanticUI.FormSettings._Impl[K] */ js.Any = js.native
  
  var settings: FormSettings = js.native
}
object Form {
  
  object ClassNameSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'active'
        */
      var active: String
      
      /**
        * @default 'disabled'
        */
      var disabled: String
      
      /**
        * @default 'default'
        */
      var placeholder: String
      
      /**
        * @default 'visible'
        */
      var visible: String
    }
    object Impl {
      
      inline def apply(active: String, disabled: String, placeholder: String, visible: String): Impl = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiForm.anon.PickImplactivePartialPick
      - typingsJapgolly.semanticUiForm.anon.PickImplplaceholderPartia
      - typingsJapgolly.semanticUiForm.anon.PickImpldisabledPartialPi
      - typingsJapgolly.semanticUiForm.anon.PickImplvisiblePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplactivePartialPick(active: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplactivePartialPick = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplactivePartialPick]
      }
      
      inline def PickImpldisabledPartialPi(disabled: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImpldisabledPartialPi = {
        val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImpldisabledPartialPi]
      }
      
      inline def PickImplplaceholderPartia(placeholder: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplplaceholderPartia = {
        val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplplaceholderPartia]
      }
      
      inline def PickImplvisiblePartialPic(visible: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplvisiblePartialPic = {
        val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplvisiblePartialPic]
      }
    }
  }
  type ClassNameSettings = Param
  
  /* Inlined semantic-ui-form.SemanticUI.Form.ErrorSettings.Param */
  trait ErrorSettings extends StObject {
    
    var method: String & js.UndefOr[String]
  }
  object ErrorSettings {
    
    inline def apply(method: String & js.UndefOr[String]): ErrorSettings = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorSettings]
    }
    
    extension [Self <: ErrorSettings](x: Self) {
      
      inline def setMethod(value: String & js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
    
    trait Impl extends StObject {
      
      /**
        * @default 'The method you called is not defined.'
        */
      var method: String
    }
    object Impl {
      
      inline def apply(method: String): Impl = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
    }
    
    /* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.ErrorSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.ErrorSettings._Impl>> */
    trait Param extends StObject {
      
      var method: String & js.UndefOr[String]
    }
    object Param {
      
      inline def apply(method: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.SemanticUI.Form.ErrorSettings.Param = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.SemanticUI.Form.ErrorSettings.Param]
      }
      
      extension [Self <: typingsJapgolly.semanticUiForm.SemanticUI.Form.ErrorSettings.Param](x: Self) {
        
        inline def setMethod(value: String & js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait Field extends StObject {
    
    var identifier: String
    
    var optional: js.UndefOr[Boolean] = js.undefined
    
    var rules: js.Array[Rule]
  }
  object Field {
    
    inline def apply(identifier: String, rules: js.Array[Rule]): Field = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    extension [Self <: Field](x: Self) {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
  
  type Fields = StringDictionary[String | js.Array[String]]
  
  /* Inlined semantic-ui-form.SemanticUI.Form.MetadataSettings.Param */
  trait MetadataSettings extends StObject {
    
    var validate: String & js.UndefOr[String]
  }
  object MetadataSettings {
    
    inline def apply(validate: String & js.UndefOr[String]): MetadataSettings = {
      val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataSettings]
    }
    
    trait Impl extends StObject {
      
      /**
        * @default 'validate'
        */
      var validate: String
    }
    object Impl {
      
      inline def apply(validate: String): Impl = {
        val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setValidate(value: String): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: MetadataSettings](x: Self) {
      
      inline def setValidate(value: String & js.UndefOr[String]): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    }
    
    /* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.MetadataSettings._Impl, 'validate'> & std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.MetadataSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.MetadataSettings._Impl>> */
    trait Param extends StObject {
      
      var validate: String & js.UndefOr[String]
    }
    object Param {
      
      inline def apply(validate: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.SemanticUI.Form.MetadataSettings.Param = {
        val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.SemanticUI.Form.MetadataSettings.Param]
      }
      
      extension [Self <: typingsJapgolly.semanticUiForm.SemanticUI.Form.MetadataSettings.Param](x: Self) {
        
        inline def setValidate(value: String & js.UndefOr[String]): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object PromptSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default '{name} must be checked'
        */
      var checked: String
      
      /**
        * @default '{name} cannot contain \'{ruleValue}\''
        */
      var contain: String
      
      /**
        * @default '{name} cannot contain exactly \'{ruleValue}\''
        */
      var containExactly: String
      
      /**
        * @default '{name} must be a valid credit card number'
        */
      var creditCard: String
      
      /**
        * @default '{name} must be a decimal number'
        */
      var decimal: String
      
      /**
        * @default '{name} must have a different value than {ruleValue} field'
        */
      var different: String
      
      /**
        * @default '{name} must contain  \'{ruleValue}\''
        */
      var doesntContain: String
      
      /**
        * @default '{name} must contain exactly \'{ruleValue}\''
        */
      var doesntContainExactly: String
      
      /**
        * @default '{name} must be a valid e-mail'
        */
      var email: String
      
      /**
        * @default '{name} must have a value'
        */
      var empty: String
      
      /**
        * @default '{name} must have exactly {ruleValue} choices'
        */
      var exactCount: String
      
      /**
        * @default '{name} must be exactly {ruleValue} characters'
        */
      var exactLength: String
      
      /**
        * @default '{name} must be an integer'
        */
      var integer: String
      
      /**
        * @default '{name} must be \'{ruleValue}\''
        */
      var is: String
      
      /**
        * @default '{name} must be exactly \'{ruleValue}\''
        */
      var isExactly: String
      
      /**
        * @default '{name} must be at least {ruleValue} characters'
        */
      var length: String
      
      /**
        * @default '{name} must match {ruleValue} field'
        */
      var `match`: String
      
      /**
        * @default '{name} must have {ruleValue} or less choices'
        */
      var maxCount: String
      
      /**
        * @default '{name} cannot be longer than {ruleValue} characters'
        */
      var maxLength: String
      
      /**
        * @default '{name} must have at least {ruleValue} choices'
        */
      var minCount: String
      
      /**
        * @default '{name} must be at least {ruleValue} characters'
        */
      var minLength: String
      
      /**
        * @default '{name} cannot be set to \'{ruleValue}\''
        */
      var not: String
      
      /**
        * @default '{name} cannot be set to exactly \'{ruleValue}\''
        */
      var notExactly: String
      
      /**
        * @default '{name} must be set to a number'
        */
      var number: String
      
      /**
        * @default '{name} is not formatted correctly'
        */
      var regExp: String
      
      /**
        * @default '{name} must be a valid url'
        */
      var url: String
    }
    object Impl {
      
      inline def apply(
        checked: String,
        contain: String,
        containExactly: String,
        creditCard: String,
        decimal: String,
        different: String,
        doesntContain: String,
        doesntContainExactly: String,
        email: String,
        empty: String,
        exactCount: String,
        exactLength: String,
        integer: String,
        is: String,
        isExactly: String,
        length: String,
        `match`: String,
        maxCount: String,
        maxLength: String,
        minCount: String,
        minLength: String,
        not: String,
        notExactly: String,
        number: String,
        regExp: String,
        url: String
      ): Impl = {
        val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], contain = contain.asInstanceOf[js.Any], containExactly = containExactly.asInstanceOf[js.Any], creditCard = creditCard.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], different = different.asInstanceOf[js.Any], doesntContain = doesntContain.asInstanceOf[js.Any], doesntContainExactly = doesntContainExactly.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], exactCount = exactCount.asInstanceOf[js.Any], exactLength = exactLength.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], isExactly = isExactly.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minCount = minCount.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], notExactly = notExactly.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
        
        inline def setContain(value: String): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
        
        inline def setContainExactly(value: String): Self = StObject.set(x, "containExactly", value.asInstanceOf[js.Any])
        
        inline def setCreditCard(value: String): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
        
        inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
        
        inline def setDifferent(value: String): Self = StObject.set(x, "different", value.asInstanceOf[js.Any])
        
        inline def setDoesntContain(value: String): Self = StObject.set(x, "doesntContain", value.asInstanceOf[js.Any])
        
        inline def setDoesntContainExactly(value: String): Self = StObject.set(x, "doesntContainExactly", value.asInstanceOf[js.Any])
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
        
        inline def setExactCount(value: String): Self = StObject.set(x, "exactCount", value.asInstanceOf[js.Any])
        
        inline def setExactLength(value: String): Self = StObject.set(x, "exactLength", value.asInstanceOf[js.Any])
        
        inline def setInteger(value: String): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
        
        inline def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
        
        inline def setIsExactly(value: String): Self = StObject.set(x, "isExactly", value.asInstanceOf[js.Any])
        
        inline def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
        
        inline def setMaxCount(value: String): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
        
        inline def setMaxLength(value: String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        inline def setMinCount(value: String): Self = StObject.set(x, "minCount", value.asInstanceOf[js.Any])
        
        inline def setMinLength(value: String): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
        
        inline def setNot(value: String): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
        
        inline def setNotExactly(value: String): Self = StObject.set(x, "notExactly", value.asInstanceOf[js.Any])
        
        inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
        
        inline def setRegExp(value: String): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiForm.anon.PickImplemptyPartialPickI
      - typingsJapgolly.semanticUiForm.anon.PickImplcheckedPartialPic
      - typingsJapgolly.semanticUiForm.anon.PickImplemailPartialPickI
      - typingsJapgolly.semanticUiForm.anon.PickImplurlPartialPickImp
      - typingsJapgolly.semanticUiForm.anon.PickImplregExpPartialPick
      - typingsJapgolly.semanticUiForm.anon.PickImplintegerPartialPic
      - typingsJapgolly.semanticUiForm.anon.PickImpldecimalPartialPic
      - typingsJapgolly.semanticUiForm.anon.PickImplnumberPartialPick
      - typingsJapgolly.semanticUiForm.anon.PickImplisPartialPickImpl
      - typingsJapgolly.semanticUiForm.anon.PickImplisExactlyPartialP
      - typingsJapgolly.semanticUiForm.anon.PickImplnotPartialPickImp
      - typingsJapgolly.semanticUiForm.anon.PickImplnotExactlyPartial
      - typingsJapgolly.semanticUiForm.anon.PickImplcontainPartialPic
      - typingsJapgolly.semanticUiForm.anon.PickImplcontainExactlyPar
      - typingsJapgolly.semanticUiForm.anon.PickImpldoesntContainPart
      - typingsJapgolly.semanticUiForm.anon.PickImpldoesntContainExac
      - typingsJapgolly.semanticUiForm.anon.PickImplminLengthPartialP
      - typingsJapgolly.semanticUiForm.anon.PickImpllengthPartialPick
      - typingsJapgolly.semanticUiForm.anon.PickImplexactLengthPartia
      - typingsJapgolly.semanticUiForm.anon.PickImplmaxLengthPartialP
      - typingsJapgolly.semanticUiForm.anon.PickImplmatchPartialPickI
      - typingsJapgolly.semanticUiForm.anon.PickImpldifferentPartialP
      - typingsJapgolly.semanticUiForm.anon.PickImplcreditCardPartial
      - typingsJapgolly.semanticUiForm.anon.PickImplminCountPartialPi
      - typingsJapgolly.semanticUiForm.anon.PickImplexactCountPartial
      - typingsJapgolly.semanticUiForm.anon.PickImplmaxCountPartialPi
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplcheckedPartialPic(checked: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplcheckedPartialPic = {
        val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplcheckedPartialPic]
      }
      
      inline def PickImplcontainExactlyPar(containExactly: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplcontainExactlyPar = {
        val __obj = js.Dynamic.literal(containExactly = containExactly.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplcontainExactlyPar]
      }
      
      inline def PickImplcontainPartialPic(contain: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplcontainPartialPic = {
        val __obj = js.Dynamic.literal(contain = contain.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplcontainPartialPic]
      }
      
      inline def PickImplcreditCardPartial(creditCard: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplcreditCardPartial = {
        val __obj = js.Dynamic.literal(creditCard = creditCard.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplcreditCardPartial]
      }
      
      inline def PickImpldecimalPartialPic(decimal: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImpldecimalPartialPic = {
        val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImpldecimalPartialPic]
      }
      
      inline def PickImpldifferentPartialP(different: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImpldifferentPartialP = {
        val __obj = js.Dynamic.literal(different = different.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImpldifferentPartialP]
      }
      
      inline def PickImpldoesntContainExac(doesntContainExactly: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImpldoesntContainExac = {
        val __obj = js.Dynamic.literal(doesntContainExactly = doesntContainExactly.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImpldoesntContainExac]
      }
      
      inline def PickImpldoesntContainPart(doesntContain: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImpldoesntContainPart = {
        val __obj = js.Dynamic.literal(doesntContain = doesntContain.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImpldoesntContainPart]
      }
      
      inline def PickImplemailPartialPickI(email: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplemailPartialPickI = {
        val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplemailPartialPickI]
      }
      
      inline def PickImplemptyPartialPickI(empty: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplemptyPartialPickI = {
        val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplemptyPartialPickI]
      }
      
      inline def PickImplexactCountPartial(exactCount: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplexactCountPartial = {
        val __obj = js.Dynamic.literal(exactCount = exactCount.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplexactCountPartial]
      }
      
      inline def PickImplexactLengthPartia(exactLength: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplexactLengthPartia = {
        val __obj = js.Dynamic.literal(exactLength = exactLength.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplexactLengthPartia]
      }
      
      inline def PickImplintegerPartialPic(integer: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplintegerPartialPic = {
        val __obj = js.Dynamic.literal(integer = integer.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplintegerPartialPic]
      }
      
      inline def PickImplisExactlyPartialP(isExactly: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplisExactlyPartialP = {
        val __obj = js.Dynamic.literal(isExactly = isExactly.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplisExactlyPartialP]
      }
      
      inline def PickImplisPartialPickImpl(is: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplisPartialPickImpl = {
        val __obj = js.Dynamic.literal(is = is.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplisPartialPickImpl]
      }
      
      inline def PickImpllengthPartialPick(length: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImpllengthPartialPick = {
        val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImpllengthPartialPick]
      }
      
      inline def PickImplmatchPartialPickI(`match`: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplmatchPartialPickI = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplmatchPartialPickI]
      }
      
      inline def PickImplmaxCountPartialPi(maxCount: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplmaxCountPartialPi = {
        val __obj = js.Dynamic.literal(maxCount = maxCount.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplmaxCountPartialPi]
      }
      
      inline def PickImplmaxLengthPartialP(maxLength: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplmaxLengthPartialP = {
        val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplmaxLengthPartialP]
      }
      
      inline def PickImplminCountPartialPi(minCount: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplminCountPartialPi = {
        val __obj = js.Dynamic.literal(minCount = minCount.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplminCountPartialPi]
      }
      
      inline def PickImplminLengthPartialP(minLength: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplminLengthPartialP = {
        val __obj = js.Dynamic.literal(minLength = minLength.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplminLengthPartialP]
      }
      
      inline def PickImplnotExactlyPartial(notExactly: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplnotExactlyPartial = {
        val __obj = js.Dynamic.literal(notExactly = notExactly.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplnotExactlyPartial]
      }
      
      inline def PickImplnotPartialPickImp(not: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplnotPartialPickImp = {
        val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplnotPartialPickImp]
      }
      
      inline def PickImplnumberPartialPick(number: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplnumberPartialPick = {
        val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplnumberPartialPick]
      }
      
      inline def PickImplregExpPartialPick(regExp: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplregExpPartialPick = {
        val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplregExpPartialPick]
      }
      
      inline def PickImplurlPartialPickImp(url: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplurlPartialPickImp = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplurlPartialPickImp]
      }
    }
  }
  type PromptSettings = typingsJapgolly.semanticUiForm.SemanticUI.Form.PromptSettings.Param
  
  trait Rule extends StObject {
    
    var prompt: String
    
    var `type`: String
  }
  object Rule {
    
    inline def apply(prompt: String, `type`: String): Rule = {
      val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    extension [Self <: Rule](x: Self) {
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rules extends StObject {
    
    var rules: js.Array[Rule]
  }
  object Rules {
    
    inline def apply(rules: js.Array[Rule]): Rules = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rules]
    }
    
    extension [Self <: Rules](x: Self) {
      
      inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
  
  object SelectorSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'input, textarea, select'
        */
      var field: String
      
      /**
        * @default '.field'
        */
      var group: String
      
      /**
        * @default 'input'
        */
      var input: String
      
      /**
        * @default '.error.message'
        */
      var message: String
      
      /**
        * @default '.prompt'
        */
      var prompt: String
      
      /**
        * @default '.submit'
        */
      var submit: String
    }
    object Impl {
      
      inline def apply(field: String, group: String, input: String, message: String, prompt: String, submit: String): Impl = {
        val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
        
        inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
        
        inline def setSubmit(value: String): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiForm.anon.PickImplmessagePartialPic
      - typingsJapgolly.semanticUiForm.anon.PickImplfieldPartialPickI
      - typingsJapgolly.semanticUiForm.anon.PickImplgroupPartialPickI
      - typingsJapgolly.semanticUiForm.anon.PickImplinputPartialPickI
      - typingsJapgolly.semanticUiForm.anon.PickImplpromptPartialPickField
      - typingsJapgolly.semanticUiForm.anon.PickImplsubmitPartialPick
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplfieldPartialPickI(field: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplfieldPartialPickI = {
        val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplfieldPartialPickI]
      }
      
      inline def PickImplgroupPartialPickI(group: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplgroupPartialPickI = {
        val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplgroupPartialPickI]
      }
      
      inline def PickImplinputPartialPickI(input: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplinputPartialPickI = {
        val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplinputPartialPickI]
      }
      
      inline def PickImplmessagePartialPic(message: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplmessagePartialPic = {
        val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplmessagePartialPic]
      }
      
      inline def PickImplpromptPartialPickField(prompt: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplpromptPartialPickField = {
        val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplpromptPartialPickField]
      }
      
      inline def PickImplsubmitPartialPick(submit: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplsubmitPartialPick = {
        val __obj = js.Dynamic.literal(submit = submit.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplsubmitPartialPick]
      }
    }
  }
  type SelectorSettings = typingsJapgolly.semanticUiForm.SemanticUI.Form.SelectorSettings.Param
  
  object TemplatesSettings {
    
    trait Impl extends StObject {
      
      def error(errors: js.Array[String]): JQuery
      
      def prompt(errors: js.Array[String]): JQuery
    }
    object Impl {
      
      inline def apply(error: js.Array[String] => JQuery, prompt: js.Array[String] => JQuery): Impl = {
        val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), prompt = js.Any.fromFunction1(prompt))
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setError(value: js.Array[String] => JQuery): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
        
        inline def setPrompt(value: js.Array[String] => JQuery): Self = StObject.set(x, "prompt", js.Any.fromFunction1(value))
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiForm.anon.PickImplerrorPartialPickIError
      - typingsJapgolly.semanticUiForm.anon.PickImplpromptPartialPickError
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplerrorPartialPickIError(
        error: (js.Function1[/* errors */ js.Array[String], JQuery]) & (js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]])
      ): typingsJapgolly.semanticUiForm.anon.PickImplerrorPartialPickIError = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplerrorPartialPickIError]
      }
      
      inline def PickImplpromptPartialPickError(
        prompt: (js.Function1[/* errors */ js.Array[String], JQuery]) & (js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]])
      ): typingsJapgolly.semanticUiForm.anon.PickImplpromptPartialPickError = {
        val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplpromptPartialPickError]
      }
    }
  }
  type TemplatesSettings = typingsJapgolly.semanticUiForm.SemanticUI.Form.TemplatesSettings.Param
  
  object TextSettings {
    
    trait Impl extends StObject {
      
      /**
        * @default 'This field'
        */
      var unspecifiedField: String
      
      /**
        * @default 'Please enter a valid value'
        */
      var unspecifiedRule: String
    }
    object Impl {
      
      inline def apply(unspecifiedField: String, unspecifiedRule: String): Impl = {
        val __obj = js.Dynamic.literal(unspecifiedField = unspecifiedField.asInstanceOf[js.Any], unspecifiedRule = unspecifiedRule.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setUnspecifiedField(value: String): Self = StObject.set(x, "unspecifiedField", value.asInstanceOf[js.Any])
        
        inline def setUnspecifiedRule(value: String): Self = StObject.set(x, "unspecifiedRule", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiForm.anon.PickImplunspecifiedRulePa
      - typingsJapgolly.semanticUiForm.anon.PickImplunspecifiedFieldP
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplunspecifiedFieldP(unspecifiedField: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplunspecifiedFieldP = {
        val __obj = js.Dynamic.literal(unspecifiedField = unspecifiedField.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplunspecifiedFieldP]
      }
      
      inline def PickImplunspecifiedRulePa(unspecifiedRule: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplunspecifiedRulePa = {
        val __obj = js.Dynamic.literal(unspecifiedRule = unspecifiedRule.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplunspecifiedRulePa]
      }
    }
  }
  type TextSettings = typingsJapgolly.semanticUiForm.SemanticUI.Form.TextSettings.Param
}
