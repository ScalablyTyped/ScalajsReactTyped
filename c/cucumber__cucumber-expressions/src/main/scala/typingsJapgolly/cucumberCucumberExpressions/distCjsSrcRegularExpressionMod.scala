package typingsJapgolly.cucumberCucumberExpressions

import typingsJapgolly.cucumberCucumberExpressions.distCjsSrcTypesMod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSrcRegularExpressionMod {
  
  @JSImport("@cucumber/cucumber-expressions/dist/cjs/src/RegularExpression", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RegularExpression {
    def this(
      regexp: js.RegExp,
      parameterTypeRegistry: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeRegistryMod.default
    ) = this()
    
    /* CompleteClass */
    override def `match`(text: String): js.Array[typingsJapgolly.cucumberCucumberExpressions.distCjsSrcArgumentMod.default] | Null = js.native
    
    /* CompleteClass */
    override val source: String = js.native
  }
  
  @js.native
  trait RegularExpression
    extends StObject
       with Expression {
    
    /* private */ val parameterTypeRegistry: Any = js.native
    
    val regexp: js.RegExp = js.native
    
    @JSName("source")
    def source_MRegularExpression: String = js.native
    
    /* private */ val treeRegexp: Any = js.native
  }
}
