package typingsJapgolly.vueTemplateCompiler.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleOptions extends StObject {
  
  def genData(el: ASTElement): String
  
  def postTransformNode(el: ASTElement): Unit
  
  def preTransformNode(el: ASTElement): js.UndefOr[ASTElement]
  
  var staticKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var transformCode: js.UndefOr[js.Function2[/* el */ ASTElement, /* code */ String, String]] = js.undefined
  
  def transformNode(el: ASTElement): js.UndefOr[ASTElement]
}
object ModuleOptions {
  
  inline def apply(
    genData: ASTElement => String,
    postTransformNode: ASTElement => Callback,
    preTransformNode: ASTElement => js.UndefOr[ASTElement],
    transformNode: ASTElement => js.UndefOr[ASTElement]
  ): ModuleOptions = {
    val __obj = js.Dynamic.literal(genData = js.Any.fromFunction1(genData), postTransformNode = js.Any.fromFunction1((t0: ASTElement) => postTransformNode(t0).runNow()), preTransformNode = js.Any.fromFunction1(preTransformNode), transformNode = js.Any.fromFunction1(transformNode))
    __obj.asInstanceOf[ModuleOptions]
  }
  
  extension [Self <: ModuleOptions](x: Self) {
    
    inline def setGenData(value: ASTElement => String): Self = StObject.set(x, "genData", js.Any.fromFunction1(value))
    
    inline def setPostTransformNode(value: ASTElement => Callback): Self = StObject.set(x, "postTransformNode", js.Any.fromFunction1((t0: ASTElement) => value(t0).runNow()))
    
    inline def setPreTransformNode(value: ASTElement => js.UndefOr[ASTElement]): Self = StObject.set(x, "preTransformNode", js.Any.fromFunction1(value))
    
    inline def setStaticKeys(value: js.Array[String]): Self = StObject.set(x, "staticKeys", value.asInstanceOf[js.Any])
    
    inline def setStaticKeysUndefined: Self = StObject.set(x, "staticKeys", js.undefined)
    
    inline def setStaticKeysVarargs(value: String*): Self = StObject.set(x, "staticKeys", js.Array(value*))
    
    inline def setTransformCode(value: (/* el */ ASTElement, /* code */ String) => String): Self = StObject.set(x, "transformCode", js.Any.fromFunction2(value))
    
    inline def setTransformCodeUndefined: Self = StObject.set(x, "transformCode", js.undefined)
    
    inline def setTransformNode(value: ASTElement => js.UndefOr[ASTElement]): Self = StObject.set(x, "transformNode", js.Any.fromFunction1(value))
  }
}
