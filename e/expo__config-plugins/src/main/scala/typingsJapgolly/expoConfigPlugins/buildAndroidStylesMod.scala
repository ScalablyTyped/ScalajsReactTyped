package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.expoConfigPlugins.anon.Add
import typingsJapgolly.expoConfigPlugins.anon.Fallback
import typingsJapgolly.expoConfigPlugins.anon.ItemParent
import typingsJapgolly.expoConfigPlugins.anon.Kind
import typingsJapgolly.expoConfigPlugins.anon.NameParent
import typingsJapgolly.expoConfigPlugins.anon.Parent
import typingsJapgolly.expoConfigPlugins.anon.ParentXml
import typingsJapgolly.expoConfigPlugins.anon.Xml
import typingsJapgolly.expoConfigPlugins.buildAndroidResourcesMod.ResourceGroupXML
import typingsJapgolly.expoConfigPlugins.buildAndroidResourcesMod.ResourceItemXML
import typingsJapgolly.expoConfigPlugins.buildAndroidResourcesMod.ResourceXML
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAndroidStylesMod {
  
  @JSImport("@expo/config-plugins/build/android/Styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignStylesValue(xml: ResourceXML, hasAddValueTargetApiNameParent: Add): ResourceXML = (^.asInstanceOf[js.Dynamic].applyDynamic("assignStylesValue")(xml.asInstanceOf[js.Any], hasAddValueTargetApiNameParent.asInstanceOf[js.Any])).asInstanceOf[ResourceXML]
  
  inline def getAppThemeLightNoActionBarGroup(): Parent = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppThemeLightNoActionBarGroup")().asInstanceOf[Parent]
  
  inline def getProjectStylesXMLPathAsync(projectRoot: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectStylesXMLPathAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getProjectStylesXMLPathAsync(projectRoot: String, hasKind: Kind): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectStylesXMLPathAsync")(projectRoot.asInstanceOf[js.Any], hasKind.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getStyleParent(xml: ResourceXML, group: NameParent): ResourceGroupXML | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyleParent")(xml.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[ResourceGroupXML | Null]
  
  inline def getStylesGroupAsObject(xml: ResourceXML, group: NameParent): (Record[String, String]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStylesGroupAsObject")(xml.asInstanceOf[js.Any], group.asInstanceOf[js.Any])).asInstanceOf[(Record[String, String]) | Null]
  
  inline def getStylesItem(hasNameXmlParent: Xml): ResourceItemXML | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getStylesItem")(hasNameXmlParent.asInstanceOf[js.Any]).asInstanceOf[ResourceItemXML | Null]
  
  inline def readStylesXMLAsync(hasPathFallback: Fallback): js.Promise[ResourceXML] = ^.asInstanceOf[js.Dynamic].applyDynamic("readStylesXMLAsync")(hasPathFallback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResourceXML]]
  
  inline def removeStylesItem(hasNameXmlParent: ParentXml): ResourceXML = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStylesItem")(hasNameXmlParent.asInstanceOf[js.Any]).asInstanceOf[ResourceXML]
  
  inline def setStylesItem(hasItemXmlParent: ItemParent): ResourceXML = ^.asInstanceOf[js.Dynamic].applyDynamic("setStylesItem")(hasItemXmlParent.asInstanceOf[js.Any]).asInstanceOf[ResourceXML]
}
