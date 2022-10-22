package typingsJapgolly.kiiCloudSdk.KiiCloud

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiACLEntry object
  */
trait KiiACLEntry extends StObject {
  
  /**
    * Get the action that is being permitted/restricted in this entry
    *
    */
  def getAction(): KiiACLAction
  
  /**
    * Get whether or not the action is being permitted to the subject
    *
    */
  def getGrant(): Boolean
  
  /**
    * Get the subject that is being permitted/restricted in this entry
    *
    */
  def getSubject[T /* <: KiiACLSubject */](): T
  
  /**
    * The action that is being permitted/restricted. Possible values:
    * <br><br>
    * KiiACLAction.KiiACLBucketActionCreateObjects,<br>
    * KiiACLAction.KiiACLBucketActionQueryObjects,  <br>
    * KiiACLAction.KiiACLBucketActionDropBucket,<br>
    * KiiACLAction.KiiACLBucketActionReadObjects,<br>
    * KiiACLAction.KiiACLObjectActionRead,<br>
    * KiiACLAction.KiiACLObjectActionWrite,<br>
    * KiiACLAction.KiiACLSubscribeToTopic,<br>
    * KiiACLAction.KiiACLSendMessageToTopic
    *
    * @param value The action being permitted/restricted
    *
    * @throws If the value is not one of the permitted values
    */
  def setAction(value: KiiACLAction): Unit
  
  /**
    * Set whether or not the action is being permitted to the subject
    *
    * @param value true if the action is permitted, false otherwise
    *
    * @throws If the value is not a boolean type
    */
  def setGrant(value: Boolean): Unit
  
  /**
    * Set the subject to which the action/grant is being applied
    *
    * @param subject instance.
    *
    * @throws If the value is not one of the permitted values
    */
  def setSubject(subject: KiiACLSubject): Unit
}
object KiiACLEntry {
  
  inline def apply(
    getAction: CallbackTo[KiiACLAction],
    getGrant: CallbackTo[Boolean],
    getSubject: CallbackTo[Any],
    setAction: KiiACLAction => Callback,
    setGrant: Boolean => Callback,
    setSubject: KiiACLSubject => Callback
  ): KiiACLEntry = {
    val __obj = js.Dynamic.literal(getAction = getAction.toJsFn, getGrant = getGrant.toJsFn, getSubject = getSubject.toJsFn, setAction = js.Any.fromFunction1((t0: KiiACLAction) => setAction(t0).runNow()), setGrant = js.Any.fromFunction1((t0: Boolean) => setGrant(t0).runNow()), setSubject = js.Any.fromFunction1((t0: KiiACLSubject) => setSubject(t0).runNow()))
    __obj.asInstanceOf[KiiACLEntry]
  }
  
  extension [Self <: KiiACLEntry](x: Self) {
    
    inline def setGetAction(value: CallbackTo[KiiACLAction]): Self = StObject.set(x, "getAction", value.toJsFn)
    
    inline def setGetGrant(value: CallbackTo[Boolean]): Self = StObject.set(x, "getGrant", value.toJsFn)
    
    inline def setGetSubject(value: CallbackTo[Any]): Self = StObject.set(x, "getSubject", value.toJsFn)
    
    inline def setSetAction(value: KiiACLAction => Callback): Self = StObject.set(x, "setAction", js.Any.fromFunction1((t0: KiiACLAction) => value(t0).runNow()))
    
    inline def setSetGrant(value: Boolean => Callback): Self = StObject.set(x, "setGrant", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetSubject(value: KiiACLSubject => Callback): Self = StObject.set(x, "setSubject", js.Any.fromFunction1((t0: KiiACLSubject) => value(t0).runNow()))
  }
}
