package typingsJapgolly.ldapjs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ldapjs.mod.AttributeJson
import typingsJapgolly.ldapjs.mod.Control
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Any extends StObject {
    
    var any: js.UndefOr[js.Array[String]] = js.undefined
    
    var attribute: String
    
    var `final`: js.UndefOr[String] = js.undefined
    
    var initial: String
  }
  object Any {
    
    inline def apply(attribute: String, initial: String): Any = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[Any]
    }
    
    extension [Self <: Any](x: Self) {
      
      inline def setAny(value: js.Array[String]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      inline def setAnyUndefined: Self = StObject.set(x, "any", js.undefined)
      
      inline def setAnyVarargs(value: String*): Self = StObject.set(x, "any", js.Array(value*))
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setFinal(value: String): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
      
      inline def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
      
      inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    }
  }
  
  trait Attribute extends StObject {
    
    var attribute: String
    
    var value: String
  }
  object Attribute {
    
    inline def apply(attribute: String, value: String): Attribute = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attribute]
    }
    
    extension [Self <: Attribute](x: Self) {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttributeString extends StObject {
    
    var attribute: String
  }
  object AttributeString {
    
    inline def apply(attribute: String): AttributeString = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeString]
    }
    
    extension [Self <: AttributeString](x: Self) {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    }
  }
  
  trait DnAttributes extends StObject {
    
    var dnAttributes: js.UndefOr[Boolean] = js.undefined
    
    var matchType: js.UndefOr[String] = js.undefined
    
    var rule: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object DnAttributes {
    
    inline def apply(value: String): DnAttributes = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DnAttributes]
    }
    
    extension [Self <: DnAttributes](x: Self) {
      
      inline def setDnAttributes(value: Boolean): Self = StObject.set(x, "dnAttributes", value.asInstanceOf[js.Any])
      
      inline def setDnAttributesUndefined: Self = StObject.set(x, "dnAttributes", js.undefined)
      
      inline def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
      
      inline def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
      
      inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FailAfter extends StObject {
    
    var failAfter: js.UndefOr[Double] = js.undefined
    
    var initialDelay: js.UndefOr[Double] = js.undefined
    
    var maxDelay: js.UndefOr[Double] = js.undefined
  }
  object FailAfter {
    
    inline def apply(): FailAfter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailAfter]
    }
    
    extension [Self <: FailAfter](x: Self) {
      
      inline def setFailAfter(value: Double): Self = StObject.set(x, "failAfter", value.asInstanceOf[js.Any])
      
      inline def setFailAfterUndefined: Self = StObject.set(x, "failAfter", js.undefined)
      
      inline def setInitialDelay(value: Double): Self = StObject.set(x, "initialDelay", value.asInstanceOf[js.Any])
      
      inline def setInitialDelayUndefined: Self = StObject.set(x, "initialDelay", js.undefined)
      
      inline def setMaxDelay(value: Double): Self = StObject.set(x, "maxDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxDelayUndefined: Self = StObject.set(x, "maxDelay", js.undefined)
    }
  }
  
  trait Filter extends StObject {
    
    var filter: typingsJapgolly.ldapjs.mod.Filter
  }
  object Filter {
    
    inline def apply(filter: typingsJapgolly.ldapjs.mod.Filter): Filter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setFilter(value: typingsJapgolly.ldapjs.mod.Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    }
  }
  
  trait Filters extends StObject {
    
    var filters: js.Array[typingsJapgolly.ldapjs.mod.Filter]
  }
  object Filters {
    
    inline def apply(filters: js.Array[typingsJapgolly.ldapjs.mod.Filter]): Filters = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filters]
    }
    
    extension [Self <: Filters](x: Self) {
      
      inline def setFilters(value: js.Array[typingsJapgolly.ldapjs.mod.Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: typingsJapgolly.ldapjs.mod.Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    }
  }
  
  /* Inlined ldapjs.ldapjs.LDAPMessageJsonObject & {  objectName :string,   attributes :std.Array<ldapjs.ldapjs.AttributeJson>} */
  trait LDAPMessageJsonObjectobje
    extends StObject
       with /* k */ StringDictionary[scala.Any] {
    
    var attributes: js.Array[AttributeJson]
    
    var controls: js.Array[Control]
    
    var messageID: Double
    
    var objectName: String
    
    var protocolOp: js.UndefOr[String] = js.undefined
  }
  object LDAPMessageJsonObjectobje {
    
    inline def apply(
      attributes: js.Array[AttributeJson],
      controls: js.Array[Control],
      messageID: Double,
      objectName: String
    ): LDAPMessageJsonObjectobje = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], objectName = objectName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LDAPMessageJsonObjectobje]
    }
    
    extension [Self <: LDAPMessageJsonObjectobje](x: Self) {
      
      inline def setAttributes(value: js.Array[AttributeJson]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: AttributeJson*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value*))
      
      inline def setMessageID(value: Double): Self = StObject.set(x, "messageID", value.asInstanceOf[js.Any])
      
      inline def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
      
      inline def setProtocolOp(value: String): Self = StObject.set(x, "protocolOp", value.asInstanceOf[js.Any])
      
      inline def setProtocolOpUndefined: Self = StObject.set(x, "protocolOp", js.undefined)
    }
  }
  
  trait PagePause extends StObject {
    
    var pagePause: js.UndefOr[Boolean] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PagePause {
    
    inline def apply(): PagePause = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagePause]
    }
    
    extension [Self <: PagePause](x: Self) {
      
      inline def setPagePause(value: Boolean): Self = StObject.set(x, "pagePause", value.asInstanceOf[js.Any])
      
      inline def setPagePauseUndefined: Self = StObject.set(x, "pagePause", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var vals: js.UndefOr[scala.Any] = js.undefined
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVals(value: scala.Any): Self = StObject.set(x, "vals", value.asInstanceOf[js.Any])
      
      inline def setValsUndefined: Self = StObject.set(x, "vals", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var attribute: String
    
    var value: String | Buffer
  }
  object Value {
    
    inline def apply(attribute: String, value: String | Buffer): Value = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
