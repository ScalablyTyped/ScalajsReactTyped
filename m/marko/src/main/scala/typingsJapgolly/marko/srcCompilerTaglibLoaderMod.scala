package typingsJapgolly.marko

import typingsJapgolly.marko.srcCompilerTaglibLoaderTaglibMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCompilerTaglibLoaderMod {
  
  @JSImport("marko/src/compiler/taglib-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("marko/src/compiler/taglib-loader", "Taglib")
  @js.native
  open class Taglib protected () extends default {
    def this(filePath: String) = this()
  }
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  inline def createTaglib(filePath: String): Taglib = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaglib")(filePath.asInstanceOf[js.Any]).asInstanceOf[Taglib]
  
  inline def loadTag(tagProps: Any, filePath: String): typingsJapgolly.marko.srcCompilerTaglibLoaderTagMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTag")(tagProps.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.marko.srcCompilerTaglibLoaderTagMod.^]
  
  inline def loadTaglibFromFile(filePath: String): Taglib = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTaglibFromFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[Taglib]
  
  inline def loadTaglibFromProps(taglib: Taglib, taglibProps: Any): Taglib = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTaglibFromProps")(taglib.asInstanceOf[js.Any], taglibProps.asInstanceOf[js.Any])).asInstanceOf[Taglib]
}
