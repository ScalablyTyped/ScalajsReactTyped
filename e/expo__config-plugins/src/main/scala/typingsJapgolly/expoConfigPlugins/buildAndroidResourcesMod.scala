package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.anon.Color
import typingsJapgolly.expoConfigPlugins.anon.Fallback
import typingsJapgolly.expoConfigPlugins.anon.Item
import typingsJapgolly.expoConfigPlugins.anon.Items
import typingsJapgolly.expoConfigPlugins.anon.NameParent
import typingsJapgolly.expoConfigPlugins.anon.Parent
import typingsJapgolly.expoConfigPlugins.anon.TargetApi
import typingsJapgolly.expoConfigPlugins.anon.ToolstargetApi
import typingsJapgolly.expoConfigPlugins.buildUtilsXmlMod.XMLObject
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidResourcesMod {
  
  @JSImport("@expo/config-plugins/build/android/Resources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildResourceGroup(parent: Items): ResourceGroupXML = ^.asInstanceOf[js.Dynamic].applyDynamic("buildResourceGroup")(parent.asInstanceOf[js.Any]).asInstanceOf[ResourceGroupXML]
  
  inline def buildResourceItem(hasNameValueTargetApiTranslatable: TargetApi): ResourceItemXML = ^.asInstanceOf[js.Dynamic].applyDynamic("buildResourceItem")(hasNameValueTargetApiTranslatable.asInstanceOf[js.Any]).asInstanceOf[ResourceItemXML]
  
  inline def ensureDefaultResourceXML(xml: XMLObject): ResourceXML = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDefaultResourceXML")(xml.asInstanceOf[js.Any]).asInstanceOf[ResourceXML]
  
  inline def findResourceGroup(xml: js.Array[ResourceGroupXML], group: NameParent): ResourceGroupXML | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findResourceGroup")(xml.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[ResourceGroupXML | Null]
  inline def findResourceGroup(xml: Unit, group: NameParent): ResourceGroupXML | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findResourceGroup")(xml.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[ResourceGroupXML | Null]
  
  inline def getObjectAsResourceGroup(group: Item): ResourceGroupXML = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectAsResourceGroup")(group.asInstanceOf[js.Any]).asInstanceOf[ResourceGroupXML]
  
  inline def getObjectAsResourceItems(obj: Record[String, String]): js.Array[ResourceItemXML] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectAsResourceItems")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[ResourceItemXML]]
  
  inline def getResourceItemsAsObject(xml: js.Array[ResourceItemXML]): (Record[String, String]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceItemsAsObject")(xml.asInstanceOf[js.Any]).asInstanceOf[(Record[String, String]) | Null]
  
  inline def readResourcesXMLAsync(hasPathFallback: Fallback): js.Promise[ResourceXML] = ^.asInstanceOf[js.Dynamic].applyDynamic("readResourcesXMLAsync")(hasPathFallback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResourceXML]]
  
  trait ResourceGroupXML extends StObject {
    
    @JSName("$")
    var $: Parent
    
    var item: js.Array[ResourceItemXML]
  }
  object ResourceGroupXML {
    
    inline def apply($: Parent, item: js.Array[ResourceItemXML]): ResourceGroupXML = {
      val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceGroupXML]
    }
    
    extension [Self <: ResourceGroupXML](x: Self) {
      
      inline def set$(value: Parent): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
      
      inline def setItem(value: js.Array[ResourceItemXML]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemVarargs(value: ResourceItemXML*): Self = StObject.set(x, "item", js.Array(value*))
    }
  }
  
  trait ResourceItemXML extends StObject {
    
    @JSName("$")
    var $: ToolstargetApi
    
    @JSName("_")
    var _underscore: String
  }
  object ResourceItemXML {
    
    inline def apply($: ToolstargetApi, _underscore: String): ResourceItemXML = {
      val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceItemXML]
    }
    
    extension [Self <: ResourceItemXML](x: Self) {
      
      inline def set$(value: ToolstargetApi): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
      
      inline def set_underscore(value: String): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.values
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.`values-night`
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.`values-v23`
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.`values-night-v23`
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.drawable
  */
  trait ResourceKind extends StObject
  object ResourceKind {
    
    inline def drawable: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.drawable = "drawable".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.drawable]
    
    inline def values: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.values = "values".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.values]
    
    inline def `values-night`: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.`values-night` = "values-night".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.`values-night`]
    
    inline def `values-night-v23`: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.`values-night-v23` = "values-night-v23".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.`values-night-v23`]
    
    inline def `values-v23`: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.`values-v23` = "values-v23".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.`values-v23`]
  }
  
  trait ResourceXML extends StObject {
    
    var resources: Color
  }
  object ResourceXML {
    
    inline def apply(resources: Color): ResourceXML = {
      val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceXML]
    }
    
    extension [Self <: ResourceXML](x: Self) {
      
      inline def setResources(value: Color): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    }
  }
}
