package typingsJapgolly.dockerEvents

import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("docker-events", JSImport.Namespace)
  @js.native
  open class ^ () extends DockerEvents {
    def this(options: DockerEventsOptions) = this()
  }
  
  @js.native
  trait DockerEvents extends EventEmitter {
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  trait DockerEventsOptions extends StObject {
    
    var docker: typingsJapgolly.dockerode.mod.^
  }
  object DockerEventsOptions {
    
    inline def apply(docker: typingsJapgolly.dockerode.mod.^): DockerEventsOptions = {
      val __obj = js.Dynamic.literal(docker = docker.asInstanceOf[js.Any])
      __obj.asInstanceOf[DockerEventsOptions]
    }
    
    extension [Self <: DockerEventsOptions](x: Self) {
      
      inline def setDocker(value: typingsJapgolly.dockerode.mod.^): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
    }
  }
}
