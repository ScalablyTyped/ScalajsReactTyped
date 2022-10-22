package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreChannelsMembersMod {
  
  @JSImport("pusher-js/types/src/core/channels/members", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Members {
    
    /* CompleteClass */
    override def addMember(memberData: Any): Any = js.native
    
    /* CompleteClass */
    var count: Double = js.native
    
    /* CompleteClass */
    override def each(callback: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def get(id: String): Any = js.native
    
    /* CompleteClass */
    var me: Any = js.native
    
    /* CompleteClass */
    var members: Any = js.native
    
    /* CompleteClass */
    var myID: Any = js.native
    
    /* CompleteClass */
    override def onSubscription(subscriptionData: Any): Unit = js.native
    
    /* CompleteClass */
    override def removeMember(memberData: Any): Any = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def setMyID(id: String): Unit = js.native
  }
  
  trait Members extends StObject {
    
    def addMember(memberData: Any): Any
    
    var count: Double
    
    def each(callback: js.Function): Unit
    
    def get(id: String): Any
    
    var me: Any
    
    var members: Any
    
    var myID: Any
    
    def onSubscription(subscriptionData: Any): Unit
    
    def removeMember(memberData: Any): Any
    
    def reset(): Unit
    
    def setMyID(id: String): Unit
  }
  object Members {
    
    inline def apply(
      addMember: Any => Any,
      count: Double,
      each: js.Function => Callback,
      get: String => Any,
      me: Any,
      members: Any,
      myID: Any,
      onSubscription: Any => Callback,
      removeMember: Any => Any,
      reset: Callback,
      setMyID: String => Callback
    ): Members = {
      val __obj = js.Dynamic.literal(addMember = js.Any.fromFunction1(addMember), count = count.asInstanceOf[js.Any], each = js.Any.fromFunction1((t0: js.Function) => each(t0).runNow()), get = js.Any.fromFunction1(get), me = me.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], myID = myID.asInstanceOf[js.Any], onSubscription = js.Any.fromFunction1((t0: Any) => onSubscription(t0).runNow()), removeMember = js.Any.fromFunction1(removeMember), reset = reset.toJsFn, setMyID = js.Any.fromFunction1((t0: String) => setMyID(t0).runNow()))
      __obj.asInstanceOf[Members]
    }
    
    extension [Self <: Members](x: Self) {
      
      inline def setAddMember(value: Any => Any): Self = StObject.set(x, "addMember", js.Any.fromFunction1(value))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setEach(value: js.Function => Callback): Self = StObject.set(x, "each", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setMe(value: Any): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: Any): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMyID(value: Any): Self = StObject.set(x, "myID", value.asInstanceOf[js.Any])
      
      inline def setOnSubscription(value: Any => Callback): Self = StObject.set(x, "onSubscription", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setRemoveMember(value: Any => Any): Self = StObject.set(x, "removeMember", js.Any.fromFunction1(value))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setSetMyID(value: String => Callback): Self = StObject.set(x, "setMyID", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
