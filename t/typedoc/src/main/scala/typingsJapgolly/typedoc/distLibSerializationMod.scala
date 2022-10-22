package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibModelsMod.ProjectReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSerializationMod {
  
  @JSImport("typedoc/dist/lib/serialization", "SerializeEvent")
  @js.native
  open class SerializeEvent protected ()
    extends typingsJapgolly.typedoc.distLibSerializationEventsMod.SerializeEvent {
    def this(name: String, project: ProjectReflection) = this()
    def this(
      name: String,
      project: ProjectReflection,
      output: typingsJapgolly.typedoc.distLibSerializationSchemaMod.ProjectReflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization", "Serializer")
  @js.native
  open class Serializer ()
    extends typingsJapgolly.typedoc.distLibSerializationSerializerMod.Serializer
  /* static members */
  object Serializer {
    
    @JSImport("typedoc/dist/lib/serialization", "Serializer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Triggered when the {@link Serializer} begins transforming a project.
      * @event EVENT_BEGIN
      */
    @JSImport("typedoc/dist/lib/serialization", "Serializer.EVENT_BEGIN")
    @js.native
    def EVENT_BEGIN: String = js.native
    inline def EVENT_BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_BEGIN")(x.asInstanceOf[js.Any])
    
    /**
      * Triggered when the {@link Serializer} has finished transforming a project.
      * @event EVENT_END
      */
    @JSImport("typedoc/dist/lib/serialization", "Serializer.EVENT_END")
    @js.native
    def EVENT_END: String = js.native
    inline def EVENT_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_END")(x.asInstanceOf[js.Any])
  }
}
