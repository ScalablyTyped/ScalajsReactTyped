package typingsJapgolly.yaml

import typingsJapgolly.std.Array
import typingsJapgolly.yaml.distDocApplyReviverMod.Reviver
import typingsJapgolly.yaml.distDocDocumentMod.Document.Parsed
import typingsJapgolly.yaml.distDocDocumentMod.Replacer
import typingsJapgolly.yaml.distNodesNodeMod.ParsedNode
import typingsJapgolly.yaml.distOptionsMod.CreateNodeOptions
import typingsJapgolly.yaml.distOptionsMod.DocumentOptions
import typingsJapgolly.yaml.distOptionsMod.ParseOptions
import typingsJapgolly.yaml.distOptionsMod.SchemaOptions
import typingsJapgolly.yaml.distOptionsMod.ToJSOptions
import typingsJapgolly.yaml.distOptionsMod.ToStringOptions
import typingsJapgolly.yaml.yamlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPublicApiMod {
  
  @JSImport("yaml/dist/public-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(src: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(src: String, options: ParseOptions & DocumentOptions & SchemaOptions & ToJSOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(src: String, reviver: Reviver): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(
    src: String,
    reviver: Reviver,
    options: ParseOptions & DocumentOptions & SchemaOptions & ToJSOptions
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(src.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseAllDocuments[T /* <: ParsedNode */](source: String): js.Array[Parsed[T]] | EmptyStream = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAllDocuments")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[Parsed[T]] | EmptyStream]
  inline def parseAllDocuments[T /* <: ParsedNode */](source: String, options: ParseOptions & DocumentOptions & SchemaOptions): js.Array[Parsed[T]] | EmptyStream = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAllDocuments")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Parsed[T]] | EmptyStream]
  
  inline def parseDocument[T /* <: ParsedNode */](source: String): Parsed[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDocument")(source.asInstanceOf[js.Any]).asInstanceOf[Parsed[T]]
  inline def parseDocument[T /* <: ParsedNode */](source: String, options: ParseOptions & DocumentOptions & SchemaOptions): Parsed[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDocument")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parsed[T]]
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(
    value: Any,
    options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions & ToStringOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: Null,
    options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions & ToStringOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Null, options: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: Unit,
    options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions & ToStringOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Unit, options: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Replacer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(
    value: Any,
    replacer: Replacer,
    options: DocumentOptions & SchemaOptions & ParseOptions & CreateNodeOptions & ToStringOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Replacer, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(value: Any, replacer: Replacer, options: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped (): yaml.anon.Comment extends (args : any): infer R ? R : any */ @js.native
  trait EmptyStream
    extends StObject
       with Array[Parsed[ParsedNode]] {
    
    var empty: `true` = js.native
  }
}
