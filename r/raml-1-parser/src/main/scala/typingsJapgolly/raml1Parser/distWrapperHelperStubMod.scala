package typingsJapgolly.raml1Parser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWrapperHelperStubMod {
  
  @JSImport("raml-1-parser/dist/wrapperHelperStub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def completeRelativeUri(res: Resource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("completeRelativeUri")(res.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Opt[T] extends StObject {
    
    def getOrElse(v: T): T
  }
  object Opt {
    
    inline def apply[T](getOrElse: T => T): Opt[T] = {
      val __obj = js.Dynamic.literal(getOrElse = js.Any.fromFunction1(getOrElse))
      __obj.asInstanceOf[Opt[T]]
    }
    
    extension [Self <: Opt[?], T](x: Self & Opt[T]) {
      
      inline def setGetOrElse(value: T => T): Self = StObject.set(x, "getOrElse", js.Any.fromFunction1(value))
    }
  }
  
  trait SchemaDef extends StObject {
    
    def content(): Any
    
    def name(): Any
  }
  object SchemaDef {
    
    inline def apply(content: CallbackTo[Any], name: CallbackTo[Any]): SchemaDef = {
      val __obj = js.Dynamic.literal(content = content.toJsFn, name = name.toJsFn)
      __obj.asInstanceOf[SchemaDef]
    }
    
    extension [Self <: SchemaDef](x: Self) {
      
      inline def setContent(value: CallbackTo[Any]): Self = StObject.set(x, "content", value.toJsFn)
      
      inline def setName(value: CallbackTo[Any]): Self = StObject.set(x, "name", value.toJsFn)
    }
  }
}
