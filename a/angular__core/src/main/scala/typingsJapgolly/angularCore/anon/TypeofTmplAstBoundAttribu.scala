package typingsJapgolly.angularCore.anon

import org.scalablytyped.runtime.Instantiable7
import typingsJapgolly.angularCompiler.mod.AST
import typingsJapgolly.angularCompiler.mod.BindingType
import typingsJapgolly.angularCompiler.mod.BoundElementProperty
import typingsJapgolly.angularCompiler.mod.I18nMeta2
import typingsJapgolly.angularCompiler.mod.ParseSourceSpan
import typingsJapgolly.angularCompiler.mod.SecurityContext
import typingsJapgolly.angularCompiler.mod.TmplAstBoundAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTmplAstBoundAttribu
  extends StObject
     with Instantiable7[
      /* name */ String, 
      /* type */ BindingType, 
      /* securityContext */ SecurityContext, 
      /* value */ AST, 
      /* unit */ String, 
      /* sourceSpan */ ParseSourceSpan, 
      /* keySpan */ ParseSourceSpan, 
      TmplAstBoundAttribute
    ] {
  
  def fromBoundElementProperty(prop: BoundElementProperty): TmplAstBoundAttribute = js.native
  def fromBoundElementProperty(prop: BoundElementProperty, i18n: I18nMeta2): TmplAstBoundAttribute = js.native
}
