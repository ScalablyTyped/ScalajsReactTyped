package typingsJapgolly.enamdict

import typingsJapgolly.enamdict.mod.NameType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enamdictStrings {
  
  @js.native
  sealed trait `given`
    extends StObject
       with NameType
  inline def `given`: `given` = "given".asInstanceOf[`given`]
  
  @js.native
  sealed trait surname
    extends StObject
       with NameType
  inline def surname: surname = "surname".asInstanceOf[surname]
  
  @js.native
  sealed trait unknown
    extends StObject
       with NameType
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
}
