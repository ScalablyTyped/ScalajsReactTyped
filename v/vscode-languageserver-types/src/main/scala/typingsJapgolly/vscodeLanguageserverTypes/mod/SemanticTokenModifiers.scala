package typingsJapgolly.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticTokenModifiers extends StObject
@JSImport("vscode-languageserver-types", "SemanticTokenModifiers")
@js.native
object SemanticTokenModifiers extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SemanticTokenModifiers & String] = js.native
  
  @js.native
  sealed trait `abstract`
    extends StObject
       with SemanticTokenModifiers
  /* "abstract" */ val `abstract`: typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.`abstract` & String = js.native
  
  @js.native
  sealed trait async
    extends StObject
       with SemanticTokenModifiers
  /* "async" */ val async: typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.async & String = js.native
  
  @js.native
  sealed trait declaration
    extends StObject
       with SemanticTokenModifiers
  /* "declaration" */ val declaration: typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.declaration & String = js.native
  
  @js.native
  sealed trait defaultLibrary
    extends StObject
       with SemanticTokenModifiers
  /* "defaultLibrary" */ val defaultLibrary: typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.defaultLibrary & String = js.native
  
  @js.native
  sealed trait definition
    extends StObject
       with SemanticTokenModifiers
  /* "definition" */ val definition: typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.definition & String = js.native
  
  @js.native
  sealed trait deprecated
    extends StObject
       with SemanticTokenModifiers
  /* "deprecated" */ val deprecated: typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.deprecated & String = js.native
  
  @js.native
  sealed trait documentation
    extends StObject
       with SemanticTokenModifiers
  /* "documentation" */ val documentation: typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.documentation & String = js.native
  
  @js.native
  sealed trait modification
    extends StObject
       with SemanticTokenModifiers
  /* "modification" */ val modification: typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.modification & String = js.native
  
  @js.native
  sealed trait readonly
    extends StObject
       with SemanticTokenModifiers
  /* "readonly" */ val readonly: typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.readonly & String = js.native
  
  @js.native
  sealed trait static
    extends StObject
       with SemanticTokenModifiers
  /* "static" */ val static: typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokenModifiers.static & String = js.native
}
