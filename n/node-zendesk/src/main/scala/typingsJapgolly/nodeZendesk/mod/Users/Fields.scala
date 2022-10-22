package typingsJapgolly.nodeZendesk.mod.Users

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nodeZendesk.mod.ZendeskCallback
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fields {
  
  trait CreateUserField
    extends StObject
       with UserField {
    
    @JSName("key")
    var key_CreateUserField: String
  }
  object CreateUserField {
    
    inline def apply(key: String, title: String): CreateUserField = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateUserField]
    }
    
    extension [Self <: CreateUserField](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomFieldOptions = StringDictionary[Any]
  
  @js.native
  trait Methods extends StObject {
    
    def create(field: CreateUserField): js.Promise[Any] = js.native
    def create(field: CreateUserField, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def delete(fieldId: ZendeskID): js.Promise[Any] = js.native
    def delete(fieldId: ZendeskID, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def list(): js.Promise[Any] = js.native
    def list(cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def show(fieldId: ZendeskID): js.Promise[Any] = js.native
    def show(fieldId: ZendeskID, cb: ZendeskCallback[Any, Any]): Any = js.native
    
    def update(fieldId: ZendeskID, field: Any): js.Promise[Any] = js.native
    def update(fieldId: ZendeskID, field: Any, cb: ZendeskCallback[Any, Any]): Any = js.native
  }
  
  /**
    * Represents 'user_field'
    */
  trait UserField extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var created_at: js.UndefOr[js.Date] = js.undefined
    
    var custom_field_options: js.UndefOr[js.Array[CustomFieldOptions]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    val id: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
    
    var raw_description: js.UndefOr[String] = js.undefined
    
    var raw_title: js.UndefOr[String] = js.undefined
    
    var regexp_for_validation: js.UndefOr[String] = js.undefined
    
    val system: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var title: String
    
    val `type`: js.UndefOr[UserFieldType] = js.undefined
    
    var updated_at: js.UndefOr[js.Date] = js.undefined
    
    val url: js.UndefOr[String] = js.undefined
  }
  object UserField {
    
    inline def apply(title: String): UserField = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserField]
    }
    
    extension [Self <: UserField](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      inline def setCustom_field_options(value: js.Array[CustomFieldOptions]): Self = StObject.set(x, "custom_field_options", value.asInstanceOf[js.Any])
      
      inline def setCustom_field_optionsUndefined: Self = StObject.set(x, "custom_field_options", js.undefined)
      
      inline def setCustom_field_optionsVarargs(value: CustomFieldOptions*): Self = StObject.set(x, "custom_field_options", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRaw_description(value: String): Self = StObject.set(x, "raw_description", value.asInstanceOf[js.Any])
      
      inline def setRaw_descriptionUndefined: Self = StObject.set(x, "raw_description", js.undefined)
      
      inline def setRaw_title(value: String): Self = StObject.set(x, "raw_title", value.asInstanceOf[js.Any])
      
      inline def setRaw_titleUndefined: Self = StObject.set(x, "raw_title", js.undefined)
      
      inline def setRegexp_for_validation(value: String): Self = StObject.set(x, "regexp_for_validation", value.asInstanceOf[js.Any])
      
      inline def setRegexp_for_validationUndefined: Self = StObject.set(x, "regexp_for_validation", js.undefined)
      
      inline def setSystem(value: Boolean): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: UserFieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUpdated_at(value: js.Date): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /**
    * Types of custom fields that can be created
    * @default 'text'
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.text
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.textarea
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.checkbox
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.date
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.integer
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.decimal
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.regexp
    - typingsJapgolly.nodeZendesk.nodeZendeskStrings.tagger
  */
  trait UserFieldType extends StObject
  object UserFieldType {
    
    inline def checkbox: typingsJapgolly.nodeZendesk.nodeZendeskStrings.checkbox = "checkbox".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.checkbox]
    
    inline def date: typingsJapgolly.nodeZendesk.nodeZendeskStrings.date = "date".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.date]
    
    inline def decimal: typingsJapgolly.nodeZendesk.nodeZendeskStrings.decimal = "decimal".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.decimal]
    
    inline def integer: typingsJapgolly.nodeZendesk.nodeZendeskStrings.integer = "integer".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.integer]
    
    inline def regexp: typingsJapgolly.nodeZendesk.nodeZendeskStrings.regexp = "regexp".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.regexp]
    
    inline def tagger: typingsJapgolly.nodeZendesk.nodeZendeskStrings.tagger = "tagger".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.tagger]
    
    inline def text: typingsJapgolly.nodeZendesk.nodeZendeskStrings.text = "text".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.text]
    
    inline def textarea: typingsJapgolly.nodeZendesk.nodeZendeskStrings.textarea = "textarea".asInstanceOf[typingsJapgolly.nodeZendesk.nodeZendeskStrings.textarea]
  }
}
