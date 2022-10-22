package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import typingsJapgolly.oracleOraclejet.anon.Path
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.external
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.internal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojcompositeMod {
  
  @JSImport("@oracle/oraclejet/ojcomposite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getComponentMetadata(name: String): Metadata | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentMetadata")(name.asInstanceOf[js.Any]).asInstanceOf[Metadata | Null]
  
  inline def register(name: String, descriptor: typingsJapgolly.oracleOraclejet.anon.Metadata): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(name.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Metadata extends StObject {
    
    var events: js.UndefOr[js.Object] = js.undefined
    
    var jetVersion: String
    
    var methods: js.UndefOr[js.Object] = js.undefined
    
    var name: String
    
    var properties: js.UndefOr[js.Object] = js.undefined
    
    var slots: js.UndefOr[js.Object] = js.undefined
    
    var version: String
  }
  object Metadata {
    
    inline def apply(jetVersion: String, name: String, version: String): Metadata = {
      val __obj = js.Dynamic.literal(jetVersion = jetVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setJetVersion(value: String): Self = StObject.set(x, "jetVersion", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: js.Object): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setSlots(value: js.Object): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropertyChangedContext extends StObject {
    
    var previousValue: Any
    
    var property: String
    
    var subproperty: js.UndefOr[Path] = js.undefined
    
    var updatedFrom: external | internal
    
    var value: Any
  }
  object PropertyChangedContext {
    
    inline def apply(previousValue: Any, property: String, updatedFrom: external | internal, value: Any): PropertyChangedContext = {
      val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyChangedContext]
    }
    
    extension [Self <: PropertyChangedContext](x: Self) {
      
      inline def setPreviousValue(value: Any): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setSubproperty(value: Path): Self = StObject.set(x, "subproperty", value.asInstanceOf[js.Any])
      
      inline def setSubpropertyUndefined: Self = StObject.set(x, "subproperty", js.undefined)
      
      inline def setUpdatedFrom(value: external | internal): Self = StObject.set(x, "updatedFrom", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewModel extends StObject {
    
    def activated(param0: ViewModelContext): js.Promise[Any] | Unit
    
    def bindingsApplied(param0: ViewModelContext): Unit
    
    def connected(param0: ViewModelContext): Unit
    
    def disconnected(param0: Element): Unit
    
    def propertyChanged(param0: PropertyChangedContext): Unit
  }
  object ViewModel {
    
    inline def apply(
      activated: ViewModelContext => js.Promise[Any] | Unit,
      bindingsApplied: ViewModelContext => Callback,
      connected: ViewModelContext => Callback,
      disconnected: Element => Callback,
      propertyChanged: PropertyChangedContext => Callback
    ): ViewModel = {
      val __obj = js.Dynamic.literal(activated = js.Any.fromFunction1(activated), bindingsApplied = js.Any.fromFunction1((t0: ViewModelContext) => bindingsApplied(t0).runNow()), connected = js.Any.fromFunction1((t0: ViewModelContext) => connected(t0).runNow()), disconnected = js.Any.fromFunction1((t0: Element) => disconnected(t0).runNow()), propertyChanged = js.Any.fromFunction1((t0: PropertyChangedContext) => propertyChanged(t0).runNow()))
      __obj.asInstanceOf[ViewModel]
    }
    
    extension [Self <: ViewModel](x: Self) {
      
      inline def setActivated(value: ViewModelContext => js.Promise[Any] | Unit): Self = StObject.set(x, "activated", js.Any.fromFunction1(value))
      
      inline def setBindingsApplied(value: ViewModelContext => Callback): Self = StObject.set(x, "bindingsApplied", js.Any.fromFunction1((t0: ViewModelContext) => value(t0).runNow()))
      
      inline def setConnected(value: ViewModelContext => Callback): Self = StObject.set(x, "connected", js.Any.fromFunction1((t0: ViewModelContext) => value(t0).runNow()))
      
      inline def setDisconnected(value: Element => Callback): Self = StObject.set(x, "disconnected", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
      
      inline def setPropertyChanged(value: PropertyChangedContext => Callback): Self = StObject.set(x, "propertyChanged", js.Any.fromFunction1((t0: PropertyChangedContext) => value(t0).runNow()))
    }
  }
  
  trait ViewModelContext extends StObject {
    
    var element: Element
    
    var properties: js.Object
    
    var slotCounts: js.Object
    
    var unique: String
    
    var uniqueId: String
  }
  object ViewModelContext {
    
    inline def apply(element: Element, properties: js.Object, slotCounts: js.Object, unique: String, uniqueId: String): ViewModelContext = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], slotCounts = slotCounts.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewModelContext]
    }
    
    extension [Self <: ViewModelContext](x: Self) {
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSlotCounts(value: js.Object): Self = StObject.set(x, "slotCounts", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: String): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    }
  }
}
