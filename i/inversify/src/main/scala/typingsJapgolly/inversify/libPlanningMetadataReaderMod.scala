package typingsJapgolly.inversify

import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.ConstructorMetadata
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.MetadataMap
import typingsJapgolly.std.NewableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlanningMetadataReaderMod {
  
  @JSImport("inversify/lib/planning/metadata_reader", "MetadataReader")
  @js.native
  open class MetadataReader ()
    extends StObject
       with typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.MetadataReader {
    
    /* CompleteClass */
    override def getConstructorMetadata(constructorFunc: NewableFunction): ConstructorMetadata = js.native
    
    /* CompleteClass */
    override def getPropertiesMetadata(constructorFunc: NewableFunction): MetadataMap = js.native
  }
}
