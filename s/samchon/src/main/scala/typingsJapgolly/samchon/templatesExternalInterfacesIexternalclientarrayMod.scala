package typingsJapgolly.samchon

import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent
import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typingsJapgolly.samchon.protocolServerIserverMod.IServer
import typingsJapgolly.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typingsJapgolly.samchon.templatesExternalExternalSystemMod.ExternalSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesExternalInterfacesIexternalclientarrayMod {
  
  @js.native
  trait IExternalClientArray[System /* <: ExternalSystem */]
    extends ExternalSystemArray[System]
       with IServer {
    
    /* InferMemberOverrides */
    override def addEventListener(
      `type`: Type,
      listener: Listener[
          System, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
    
    /* InferMemberOverrides */
    override def dispatchEvent(
      event: CollectionEvent[
          System, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
    
    /* InferMemberOverrides */
    override def hasEventListener(`type`: Type): Boolean = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(
      `type`: Type,
      listener: Listener[
          System, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
  }
}
