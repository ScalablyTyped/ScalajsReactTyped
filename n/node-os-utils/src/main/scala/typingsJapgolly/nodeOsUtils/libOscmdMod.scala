package typingsJapgolly.nodeOsUtils

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOscmdMod {
  
  @JSImport("node-os-utils/lib/oscmd", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with OsCmd {
    
    /* CompleteClass */
    override def diskUsage(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def ifconfig(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def openPorts(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def processesUsers(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def topCpu(): js.Function0[js.Promise[String]] = js.native
    
    /* CompleteClass */
    override def topMem(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def vmstats(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def who(): js.Promise[String] = js.native
    
    /* CompleteClass */
    override def whoami(): js.Promise[String] = js.native
  }
  
  trait OsCmd extends StObject {
    
    def diskUsage(): js.Promise[String]
    
    def ifconfig(): js.Promise[String]
    
    def openPorts(): js.Promise[String]
    
    def processesUsers(): js.Promise[String]
    
    def topCpu(): js.Function0[js.Promise[String]]
    
    def topMem(): js.Promise[String]
    
    def vmstats(): js.Promise[String]
    
    def who(): js.Promise[String]
    
    def whoami(): js.Promise[String]
  }
  object OsCmd {
    
    inline def apply(
      diskUsage: CallbackTo[js.Promise[String]],
      ifconfig: CallbackTo[js.Promise[String]],
      openPorts: CallbackTo[js.Promise[String]],
      processesUsers: CallbackTo[js.Promise[String]],
      topCpu: CallbackTo[js.Function0[js.Promise[String]]],
      topMem: CallbackTo[js.Promise[String]],
      vmstats: CallbackTo[js.Promise[String]],
      who: CallbackTo[js.Promise[String]],
      whoami: CallbackTo[js.Promise[String]]
    ): OsCmd = {
      val __obj = js.Dynamic.literal(diskUsage = diskUsage.toJsFn, ifconfig = ifconfig.toJsFn, openPorts = openPorts.toJsFn, processesUsers = processesUsers.toJsFn, topCpu = topCpu.toJsFn, topMem = topMem.toJsFn, vmstats = vmstats.toJsFn, who = who.toJsFn, whoami = whoami.toJsFn)
      __obj.asInstanceOf[OsCmd]
    }
    
    extension [Self <: OsCmd](x: Self) {
      
      inline def setDiskUsage(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "diskUsage", value.toJsFn)
      
      inline def setIfconfig(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "ifconfig", value.toJsFn)
      
      inline def setOpenPorts(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "openPorts", value.toJsFn)
      
      inline def setProcessesUsers(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "processesUsers", value.toJsFn)
      
      inline def setTopCpu(value: CallbackTo[js.Function0[js.Promise[String]]]): Self = StObject.set(x, "topCpu", value.toJsFn)
      
      inline def setTopMem(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "topMem", value.toJsFn)
      
      inline def setVmstats(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "vmstats", value.toJsFn)
      
      inline def setWho(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "who", value.toJsFn)
      
      inline def setWhoami(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "whoami", value.toJsFn)
    }
  }
}
