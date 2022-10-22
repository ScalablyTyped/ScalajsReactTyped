package typingsJapgolly.micromarkExtensionFrontmatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibSyntaxMod {
  
  @JSImport("micromark-extension-frontmatter/dev/lib/syntax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def frontmatter(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatter")().asInstanceOf[Extension]
  inline def frontmatter(options: typingsJapgolly.micromarkExtensionFrontmatter.devMattersMod.Options): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("frontmatter")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  type Construct = typingsJapgolly.micromarkUtilTypes.mod.Construct
  
  type ConstructRecord = typingsJapgolly.micromarkUtilTypes.mod.ConstructRecord
  
  type Extension = typingsJapgolly.micromarkUtilTypes.mod.Extension
  
  type Info = typingsJapgolly.micromarkExtensionFrontmatter.devMattersMod.Info
  
  type Matter = typingsJapgolly.micromarkExtensionFrontmatter.devMattersMod.Matter
  
  type Options = typingsJapgolly.micromarkExtensionFrontmatter.devMattersMod.Options
  
  type State = typingsJapgolly.micromarkUtilTypes.mod.State
  
  type Tokenizer = typingsJapgolly.micromarkUtilTypes.mod.Tokenizer
}
