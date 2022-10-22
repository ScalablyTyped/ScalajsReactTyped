package typingsJapgolly.expoConfigPlugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidPropertiesMod {
  
  @JSImport("@expo/config-plugins/build/android/Properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parsePropertiesFile(contents: String): js.Array[PropertiesItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePropertiesFile")(contents.asInstanceOf[js.Any]).asInstanceOf[js.Array[PropertiesItem]]
  
  inline def propertiesListToString(props: js.Array[PropertiesItem]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("propertiesListToString")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoConfigPlugins.anon.Type
    - typingsJapgolly.expoConfigPlugins.anon.`0`
    - typingsJapgolly.expoConfigPlugins.anon.Key
  */
  trait PropertiesItem extends StObject
  object PropertiesItem {
    
    inline def `0`(): typingsJapgolly.expoConfigPlugins.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("empty")
      __obj.asInstanceOf[typingsJapgolly.expoConfigPlugins.anon.`0`]
    }
    
    inline def Key(key: String, value: String): typingsJapgolly.expoConfigPlugins.anon.Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("property")
      __obj.asInstanceOf[typingsJapgolly.expoConfigPlugins.anon.Key]
    }
    
    inline def Type(value: String): typingsJapgolly.expoConfigPlugins.anon.Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[typingsJapgolly.expoConfigPlugins.anon.Type]
    }
  }
}
