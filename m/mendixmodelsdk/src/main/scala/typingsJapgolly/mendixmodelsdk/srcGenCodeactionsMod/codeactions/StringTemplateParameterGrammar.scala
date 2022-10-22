package typingsJapgolly.mendixmodelsdk.srcGenCodeactionsMod.codeactions

import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.StringTemplateParameterGrammar")
@js.native
open class StringTemplateParameterGrammar protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object StringTemplateParameterGrammar {
  
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.StringTemplateParameterGrammar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.StringTemplateParameterGrammar.Sql")
  @js.native
  def Sql: StringTemplateParameterGrammar = js.native
  inline def Sql_=(x: StringTemplateParameterGrammar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sql")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/codeactions", "codeactions.StringTemplateParameterGrammar.Text")
  @js.native
  def Text: StringTemplateParameterGrammar = js.native
  inline def Text_=(x: StringTemplateParameterGrammar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
}
