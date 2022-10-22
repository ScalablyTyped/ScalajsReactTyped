package typingsJapgolly.nginstackEngine

import typingsJapgolly.nginstackEngine.anon.CLASS
import typingsJapgolly.nginstackEngine.libSettingsSettingTypeMod.SettingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSettingsGeneralSettingsMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/settings/GeneralSettings", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GeneralSettings
  @JSImport("@nginstack/engine/lib/settings/GeneralSettings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): GeneralSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[GeneralSettings]
  
  type DataSet = typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
  
  @js.native
  trait GeneralSettings extends StObject {
    
    /* private */ var data_ : Any = js.native
    
    /* private */ var database_ : Any = js.native
    
    def get(id: String): Any = js.native
    def get(id: Double): Any = js.native
    def get(id: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Any = js.native
    
    def getDefaultValue(id: String): Any = js.native
    def getDefaultValue(id: Double): Any = js.native
    def getDefaultValue(id: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Any = js.native
    
    /* private */ var getRecordValue_ : Any = js.native
    
    def getSettingOptionsFromRecord(data: DataSet): SettingOptions = js.native
    
    /* private */ var keyIsValid_ : Any = js.native
    
    /* private */ var logger_ : Any = js.native
    
    /* private */ var normalizeValue_ : Any = js.native
    
    def parseValue(text: String, options: SettingOptions): Any = js.native
    
    def stringifyValue(value: Any, options: SettingOptions): String = js.native
    
    def update(id: String, value: Any): Double = js.native
    def update(id: Double, value: Any): Double = js.native
    def update(id: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^, value: Any): Double = js.native
    
    /* private */ var updateRecordValue_ : Any = js.native
    
    /* private */ var update_ : Any = js.native
    
    def validateSettingName(name: String): Unit = js.native
    def validateSettingName(name: String, key: Double): Unit = js.native
    def validateSettingName(name: String, key: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^): Unit = js.native
    
    var version: Double = js.native
  }
  
  trait SettingOptions extends StObject {
    
    var classKey: js.UndefOr[typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ | Double] = js.undefined
    
    var lookupType: js.UndefOr[CLASS] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var `type`: SettingType
  }
  object SettingOptions {
    
    inline def apply(`type`: SettingType): SettingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingOptions]
    }
    
    extension [Self <: SettingOptions](x: Self) {
      
      inline def setClassKey(value: typingsJapgolly.nginstackEngine.libDbkeyDbkeyMod.^ | Double): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setClassKeyUndefined: Self = StObject.set(x, "classKey", js.undefined)
      
      inline def setLookupType(value: CLASS): Self = StObject.set(x, "lookupType", value.asInstanceOf[js.Any])
      
      inline def setLookupTypeUndefined: Self = StObject.set(x, "lookupType", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setType(value: SettingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
