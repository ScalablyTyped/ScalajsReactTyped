package typingsJapgolly.yamlFrontMatter

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsYaml.mod.LoadOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.yamlFrontMatter.anon.ContentKeyName
import typingsJapgolly.yamlFrontMatter.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yaml-front-matter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadFront(content: String): Dictkey = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFront")(content.asInstanceOf[js.Any]).asInstanceOf[Dictkey]
  inline def loadFront(content: String, options: LoadOptions): Dictkey = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Dictkey]
  inline def loadFront(content: Buffer): Dictkey = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFront")(content.asInstanceOf[js.Any]).asInstanceOf[Dictkey]
  inline def loadFront(content: Buffer, options: LoadOptions): Dictkey = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Dictkey]
  
  inline def loadFront_contentKeyName_Intersection[contentKeyName /* <: String */](content: String, options: LoadOptions & ContentKeyName[contentKeyName]): (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in contentKeyName ]: string} */ js.Any) & StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in contentKeyName ]: string} */ js.Any) & StringDictionary[Any]]
  inline def loadFront_contentKeyName_Intersection[contentKeyName /* <: String */](content: Buffer, options: LoadOptions & ContentKeyName[contentKeyName]): (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in contentKeyName ]: string} */ js.Any) & StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in contentKeyName ]: string} */ js.Any) & StringDictionary[Any]]
  
  inline def safeLoadFront(content: String): Dictkey = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadFront")(content.asInstanceOf[js.Any]).asInstanceOf[Dictkey]
  inline def safeLoadFront(content: String, options: LoadOptions): Dictkey = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Dictkey]
  inline def safeLoadFront(content: Buffer): Dictkey = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadFront")(content.asInstanceOf[js.Any]).asInstanceOf[Dictkey]
  inline def safeLoadFront(content: Buffer, options: LoadOptions): Dictkey = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Dictkey]
  
  inline def safeLoadFront_contentKeyName_Intersection[contentKeyName /* <: String */](content: String, options: LoadOptions & ContentKeyName[contentKeyName]): (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in contentKeyName ]: string} */ js.Any) & StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in contentKeyName ]: string} */ js.Any) & StringDictionary[Any]]
  inline def safeLoadFront_contentKeyName_Intersection[contentKeyName /* <: String */](content: Buffer, options: LoadOptions & ContentKeyName[contentKeyName]): (/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in contentKeyName ]: string} */ js.Any) & StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: {readonly [ key in contentKeyName ]: string} */ js.Any) & StringDictionary[Any]]
}
