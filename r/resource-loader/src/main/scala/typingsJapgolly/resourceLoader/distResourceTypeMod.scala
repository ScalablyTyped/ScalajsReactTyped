package typingsJapgolly.resourceLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResourceTypeMod {
  
  @js.native
  sealed trait ResourceState extends StObject
  @JSImport("resource-loader/dist/resource_type", "ResourceState")
  @js.native
  object ResourceState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResourceState & Double] = js.native
    
    @js.native
    sealed trait Complete
      extends StObject
         with ResourceState
    /* 2 */ val Complete: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceState.Complete & Double = js.native
    
    @js.native
    sealed trait Loading
      extends StObject
         with ResourceState
    /* 1 */ val Loading: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceState.Loading & Double = js.native
    
    @js.native
    sealed trait NotStarted
      extends StObject
         with ResourceState
    /* 0 */ val NotStarted: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceState.NotStarted & Double = js.native
  }
  
  @js.native
  sealed trait ResourceType extends StObject
  @JSImport("resource-loader/dist/resource_type", "ResourceType")
  @js.native
  object ResourceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResourceType & Double] = js.native
    
    @js.native
    sealed trait Audio
      extends StObject
         with ResourceType
    /* 6 */ val Audio: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Audio & Double = js.native
    
    @js.native
    sealed trait Blob
      extends StObject
         with ResourceType
    /* 2 */ val Blob: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Blob & Double = js.native
    
    @js.native
    sealed trait Buffer
      extends StObject
         with ResourceType
    /* 1 */ val Buffer: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Buffer & Double = js.native
    
    @js.native
    sealed trait Image
      extends StObject
         with ResourceType
    /* 5 */ val Image: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Image & Double = js.native
    
    @js.native
    sealed trait Json
      extends StObject
         with ResourceType
    /* 3 */ val Json: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Json & Double = js.native
    
    @js.native
    sealed trait Text
      extends StObject
         with ResourceType
    /* 8 */ val Text: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Text & Double = js.native
    
    @js.native
    sealed trait Unknown
      extends StObject
         with ResourceType
    /* 0 */ val Unknown: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Unknown & Double = js.native
    
    @js.native
    sealed trait Video
      extends StObject
         with ResourceType
    /* 7 */ val Video: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Video & Double = js.native
    
    @js.native
    sealed trait Xml
      extends StObject
         with ResourceType
    /* 4 */ val Xml: typingsJapgolly.resourceLoader.distResourceTypeMod.ResourceType.Xml & Double = js.native
  }
}
