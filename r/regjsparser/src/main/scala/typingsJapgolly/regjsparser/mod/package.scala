package typingsJapgolly.regjsparser.mod

import typingsJapgolly.regjsparser.anon.Behavior
import typingsJapgolly.regjsparser.anon.BehaviorBody
import typingsJapgolly.regjsparser.anon.Body
import typingsJapgolly.regjsparser.anon.ModifierFlagsUndefined
import typingsJapgolly.regjsparser.anon.Name
import typingsJapgolly.regjsparser.anon.NameUndefined
import typingsJapgolly.regjsparser.mod.^
import typingsJapgolly.regjsparser.regjsparserStrings.dot
import typingsJapgolly.regjsparser.regjsparserStrings.group
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def parse[F /* <: Features */](str: String, flags: String): RootNode[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[RootNode[F]]
inline def parse[F /* <: Features */](str: String, flags: String, features: F): RootNode[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[RootNode[F]]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.regjsparser.mod.Alternative[F]
  - typingsJapgolly.regjsparser.mod.Anchor
  - typingsJapgolly.regjsparser.mod.CharacterClass[F]
  - typingsJapgolly.regjsparser.mod.CharacterClassEscape
  - typingsJapgolly.regjsparser.mod.CharacterClassRange
  - typingsJapgolly.regjsparser.mod.Disjunction[F]
  - typingsJapgolly.regjsparser.mod.Dot
  - typingsJapgolly.regjsparser.mod.Group[F]
  - typingsJapgolly.regjsparser.mod.Quantifier[F]
  - typingsJapgolly.regjsparser.mod.Reference[F]
  - typingsJapgolly.regjsparser.mod.If[
/ * import warning: importer.ImportType#apply Failed type conversion: F['unicodePropertyEscape'] * / js.Any, 
typingsJapgolly.regjsparser.mod.UnicodePropertyEscape, 
scala.Nothing]
  - typingsJapgolly.regjsparser.mod.Value
*/
type AstNode[F /* <: Features */] = _AstNode[F] | (If[
/* import warning: importer.ImportType#apply Failed type conversion: F['unicodePropertyEscape'] */ js.Any, 
UnicodePropertyEscape, 
scala.Nothing]) | Dot | Group[F] | Reference[F]

type CapturingGroup[F /* <: Features */] = Base[group] & Behavior[F] & (If[
/* import warning: importer.ImportType#apply Failed type conversion: F['namedGroups'] */ js.Any, 
Name, 
NameUndefined])

type Dot = Base[dot]

type Group[F /* <: Features */] = CapturingGroup[F] | NonCapturingGroup[F]

type NonCapturingGroup[F /* <: Features */] = (Body[F] & Base[group]) | (BehaviorBody[F] & (If[
/* import warning: importer.ImportType#apply Failed type conversion: F['modifiers'] */ js.Any, 
typingsJapgolly.regjsparser.anon.ModifierFlags, 
ModifierFlagsUndefined]) & Base[group])

type Reference[F /* <: Features */] = If[
/* import warning: importer.ImportType#apply Failed type conversion: F['namedGroups'] */ js.Any, 
NamedReference, 
IndexReference]

type RootNode[F /* <: Features */] = Exclude[AstNode[F], CharacterClassRange]
