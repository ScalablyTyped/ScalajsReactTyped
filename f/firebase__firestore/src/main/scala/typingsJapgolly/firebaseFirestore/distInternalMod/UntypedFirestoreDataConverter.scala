package typingsJapgolly.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An untyped Firestore Data Converter interface that is shared between the
  * lite, firestore-exp and classic SDK.
  */
@js.native
trait UntypedFirestoreDataConverter[T] extends StObject {
  
  def fromFirestore(snapshot: Any): T = js.native
  def fromFirestore(snapshot: Any, options: Any): T = js.native
  
  def toFirestore(
    modelObject: PartialWithFieldValue[T],
    options: typingsJapgolly.firebaseFirestoreTypes.mod.SetOptions
  ): typingsJapgolly.firebaseFirestoreTypes.mod.DocumentData = js.native
  def toFirestore(modelObject: WithFieldValue[T]): typingsJapgolly.firebaseFirestoreTypes.mod.DocumentData = js.native
}
