package typingsJapgolly.opentracing

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReferenceMod {
  
  @JSImport("opentracing/lib/reference", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Reference {
    /**
      * Initialize a new Reference instance.
      *
      * @param {string} type - the Reference type constant (e.g.,
      *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
      * @param {SpanContext} referencedContext - the SpanContext being referred
      *        to. As a convenience, a Span instance may be passed in instead
      *        (in which case its .context() is used here).
      */
    def this(`type`: String, referencedContext: typingsJapgolly.opentracing.libSpanContextMod.default) = this()
    def this(`type`: String, referencedContext: typingsJapgolly.opentracing.libSpanMod.default) = this()
    
    /* protected */ /* CompleteClass */
    var _referencedContext: typingsJapgolly.opentracing.libSpanContextMod.default = js.native
    
    /* protected */ /* CompleteClass */
    var _type: String = js.native
    
    /**
      * @return {SpanContext} The SpanContext being referred to (e.g., the
      *         parent in a REFERENCE_CHILD_OF Reference).
      */
    /* CompleteClass */
    override def referencedContext(): typingsJapgolly.opentracing.libSpanContextMod.default = js.native
    
    /**
      * @return {string} The Reference type (e.g., REFERENCE_CHILD_OF or
      *         REFERENCE_FOLLOWS_FROM).
      */
    /* CompleteClass */
    override def `type`(): String = js.native
  }
  
  trait Reference extends StObject {
    
    /* protected */ var _referencedContext: typingsJapgolly.opentracing.libSpanContextMod.default
    
    /* protected */ var _type: String
    
    /**
      * @return {SpanContext} The SpanContext being referred to (e.g., the
      *         parent in a REFERENCE_CHILD_OF Reference).
      */
    def referencedContext(): typingsJapgolly.opentracing.libSpanContextMod.default
    
    /**
      * @return {string} The Reference type (e.g., REFERENCE_CHILD_OF or
      *         REFERENCE_FOLLOWS_FROM).
      */
    def `type`(): String
  }
  object Reference {
    
    inline def apply(
      _referencedContext: typingsJapgolly.opentracing.libSpanContextMod.default,
      _type: String,
      referencedContext: CallbackTo[typingsJapgolly.opentracing.libSpanContextMod.default],
      `type`: CallbackTo[String]
    ): Reference = {
      val __obj = js.Dynamic.literal(_referencedContext = _referencedContext.asInstanceOf[js.Any], _type = _type.asInstanceOf[js.Any], referencedContext = referencedContext.toJsFn)
      __obj.updateDynamic("type")(`type`.toJsFn)
      __obj.asInstanceOf[Reference]
    }
    
    extension [Self <: Reference](x: Self) {
      
      inline def setReferencedContext(value: CallbackTo[typingsJapgolly.opentracing.libSpanContextMod.default]): Self = StObject.set(x, "referencedContext", value.toJsFn)
      
      inline def setType(value: CallbackTo[String]): Self = StObject.set(x, "type", value.toJsFn)
      
      inline def set_referencedContext(value: typingsJapgolly.opentracing.libSpanContextMod.default): Self = StObject.set(x, "_referencedContext", value.asInstanceOf[js.Any])
      
      inline def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    }
  }
}
