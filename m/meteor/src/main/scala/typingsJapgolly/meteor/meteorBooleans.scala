package typingsJapgolly.meteor

import typingsJapgolly.meteor.Mongo.CurrentDateModifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorBooleans {
  
  @js.native
  sealed trait `false` extends StObject
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  @js.native
  sealed trait `true`
    extends StObject
       with CurrentDateModifier
       with typingsJapgolly.meteor.mongoMod.Mongo.CurrentDateModifier
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
