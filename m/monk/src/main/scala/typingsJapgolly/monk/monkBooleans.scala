package typingsJapgolly.monk

import typingsJapgolly.monk.mod.DropResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monkBooleans {
  
  @js.native
  sealed trait `false` extends StObject
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with DropResult
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
