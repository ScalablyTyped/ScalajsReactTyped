package typingsJapgolly.trustedTypes

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Window
import typingsJapgolly.trustedTypes.libMod.TrustedTypePolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable-next-line no-unnecessary-class
  @JSImport("trusted-types", "TrustedTypeConfig")
  @js.native
  open class TrustedTypeConfig protected () extends StObject {
    def this(
      isLoggingEnabled: Boolean,
      isEnforcementEnabled: Boolean,
      allowedPolicyNames: js.Array[String],
      allowDuplicates: Boolean
    ) = this()
    def this(
      isLoggingEnabled: Boolean,
      isEnforcementEnabled: Boolean,
      allowedPolicyNames: js.Array[String],
      allowDuplicates: Boolean,
      cspString: String
    ) = this()
    def this(
      isLoggingEnabled: Boolean,
      isEnforcementEnabled: Boolean,
      allowedPolicyNames: js.Array[String],
      allowDuplicates: Boolean,
      cspString: String,
      windowObject: Window
    ) = this()
    def this(
      isLoggingEnabled: Boolean,
      isEnforcementEnabled: Boolean,
      allowedPolicyNames: js.Array[String],
      allowDuplicates: Boolean,
      cspString: Null,
      windowObject: Window
    ) = this()
    def this(
      isLoggingEnabled: Boolean,
      isEnforcementEnabled: Boolean,
      allowedPolicyNames: js.Array[String],
      allowDuplicates: Boolean,
      cspString: Unit,
      windowObject: Window
    ) = this()
  }
  
  /* was `typeof lib.TrustedTypePolicy` */
  /* note: abstract class */ @JSImport("trusted-types", "TrustedTypePolicy")
  @js.native
  open class TrustedTypePolicy[Options /* <: TrustedTypePolicyOptions */] ()
    extends typingsJapgolly.trustedTypes.mod.global.TrustedTypePolicy[Options]
  
  /* was `typeof lib.TrustedTypePolicyFactory` */
  /* note: abstract class */ @JSImport("trusted-types", "TrustedTypePolicyFactory")
  @js.native
  open class TrustedTypePolicyFactory ()
    extends typingsJapgolly.trustedTypes.mod.global.TrustedTypePolicyFactory
  
  @JSImport("trusted-types", "TrustedTypesEnforcer")
  @js.native
  open class TrustedTypesEnforcer protected () extends StObject {
    def this(config: TrustedTypeConfig) = this()
    
    def install(): Unit = js.native
    
    def uninstall(): Unit = js.native
  }
  
  // Re-export the type definitions globally.
  object global {
    
    /* was `typeof lib.TrustedHTML` */
    @JSGlobal("TrustedHTML")
    @js.native
    /* private */ open class TrustedHTML ()
      extends typingsJapgolly.trustedTypes.libMod.TrustedHTML
    
    /* was `typeof lib.TrustedScript` */
    @JSGlobal("TrustedScript")
    @js.native
    /* private */ open class TrustedScript ()
      extends typingsJapgolly.trustedTypes.libMod.TrustedScript
    
    /* was `typeof lib.TrustedScriptURL` */
    @JSGlobal("TrustedScriptURL")
    @js.native
    /* private */ open class TrustedScriptURL ()
      extends typingsJapgolly.trustedTypes.libMod.TrustedScriptURL
    
    /* was `typeof lib.TrustedTypePolicy` */
    /* note: abstract class */ @JSGlobal("TrustedTypePolicy")
    @js.native
    open class TrustedTypePolicy[Options /* <: typingsJapgolly.trustedTypes.libMod.TrustedTypePolicyOptions */] ()
      extends typingsJapgolly.trustedTypes.libMod.TrustedTypePolicy[Options]
    
    /* was `typeof lib.TrustedTypePolicyFactory` */
    /* note: abstract class */ @JSGlobal("TrustedTypePolicyFactory")
    @js.native
    open class TrustedTypePolicyFactory ()
      extends typingsJapgolly.trustedTypes.libMod.TrustedTypePolicyFactory
    
    type TrustedTypePolicyOptions = typingsJapgolly.trustedTypes.libMod.TrustedTypePolicyOptions
  }
  
  object trustedTypes extends Shortcut {
    
    @JSImport("trusted-types", "trustedTypes")
    @js.native
    val ^ : InternalTrustedTypePolicyFactory = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("trusted-types", "trustedTypes.TrustedHTML")
    @js.native
    open class TrustedHTML ()
      extends typingsJapgolly.trustedTypes.libMod.TrustedHTML
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("trusted-types", "trustedTypes.TrustedScript")
    @js.native
    open class TrustedScript ()
      extends typingsJapgolly.trustedTypes.libMod.TrustedScript
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("trusted-types", "trustedTypes.TrustedScriptURL")
    @js.native
    open class TrustedScriptURL ()
      extends typingsJapgolly.trustedTypes.libMod.TrustedScriptURL
    
    type _To = InternalTrustedTypePolicyFactory
    
    /* This means you don't have to write `^`, but can instead just say `trustedTypes.foo` */
    override def _to: InternalTrustedTypePolicyFactory = ^
  }
  
  // These are the available exports when using the polyfill as npm package (e.g. in nodejs)
  @js.native
  trait InternalTrustedTypePolicyFactory
    extends typingsJapgolly.trustedTypes.libMod.TrustedTypePolicyFactory {
    
    var TrustedHTML: Instantiable0[typingsJapgolly.trustedTypes.libMod.TrustedHTML] = js.native
    
    var TrustedScript: Instantiable0[typingsJapgolly.trustedTypes.libMod.TrustedScript] = js.native
    
    var TrustedScriptURL: Instantiable0[typingsJapgolly.trustedTypes.libMod.TrustedScriptURL] = js.native
  }
}
