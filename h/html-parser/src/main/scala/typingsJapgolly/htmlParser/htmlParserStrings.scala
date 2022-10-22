package typingsJapgolly.htmlParser

import typingsJapgolly.htmlParser.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlParserStrings {
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with Token
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait QuestionmarkGreaterthansign
    extends StObject
       with Token
  inline def QuestionmarkGreaterthansign: QuestionmarkGreaterthansign = "?>".asInstanceOf[QuestionmarkGreaterthansign]
  
  @js.native
  sealed trait SlashGreaterthansign
    extends StObject
       with Token
  inline def SlashGreaterthansign: SlashGreaterthansign = "/>".asInstanceOf[SlashGreaterthansign]
}
