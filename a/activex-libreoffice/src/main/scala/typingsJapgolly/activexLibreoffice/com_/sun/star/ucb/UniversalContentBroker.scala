package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a one-instance service that provides access to a set of Contents via ContentProviders.
  *
  * Traditionally, this service implements {@link com.sun.star.lang.XInitialization} and needed to be instantiated once with two arguments via {@link
  * com.sun.star.lang.XMultiComponentFactory.createInstanceWithArgumentsAndContext()} for configuration before it could be obtained via plain {@link
  * com.sun.star.lang.XMultiComponentFactory.createInstanceWithContext()} .
  *
  * However, the only pair of initialization arguments used in practice is `"Local"` / `"Office"` , so this service is simplified now to automatically
  * configure itself with that argument pair upon first instantiation.
  *
  * (For backwards compatibility, the service implementation still supports {@link com.sun.star.lang.XInitialization} and can still explicitly be
  * initialized via {@link com.sun.star.lang.XMultiComponentFactory.createInstanceWithArgumentsAndContext()} with two arguments of type string. These
  * strings are used as a pair of keys to retrieve a set of content provider descriptions from the configuration management (stored at
  * `org.openoffice.ucb.Configuration.ContentProviders.key1.SecondaryKeys.key2.ProviderData` within the configuration management's hierarchy). The
  * retrieved descriptions are in turn used to register the corresponding content provider services at the broker.)
  */
trait UniversalContentBroker
  extends StObject
     with XUniversalContentBroker {
  
  /**
    * The (default) constructor.
    *
    * (This default constructor is only mentioned explicitly for technical reasons, so that its implementation calls the service implementation's {@link
    * com.sun.star.lang.XInitialization.initialize()} .)
    */
  def create(): Unit
}
object UniversalContentBroker {
  
  inline def apply(
    abort: Double => Callback,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => Double,
    create: Callback,
    createCommandIdentifier: CallbackTo[Double],
    createContentIdentifier: String => XContentIdentifier,
    deregisterContentProvider: (XContentProvider, String) => Callback,
    dispose: Callback,
    execute: (Command, Double, XCommandEnvironment) => Any,
    queryContent: XContentIdentifier => XContent,
    queryContentProvider: String => XContentProvider,
    queryContentProviders: CallbackTo[SafeArray[ContentProviderInfo]],
    queryInterface: `type` => Any,
    registerContentProvider: (XContentProvider, String, Boolean) => XContentProvider,
    release: Callback,
    releaseCommandIdentifier: Double => Callback,
    removeEventListener: XEventListener => Callback
  ): UniversalContentBroker = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1((t0: Double) => abort(t0).runNow()), acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), compareContentIds = js.Any.fromFunction2(compareContentIds), create = create.toJsFn, createCommandIdentifier = createCommandIdentifier.toJsFn, createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), deregisterContentProvider = js.Any.fromFunction2((t0: XContentProvider, t1: String) => (deregisterContentProvider(t0, t1)).runNow()), dispose = dispose.toJsFn, execute = js.Any.fromFunction3(execute), queryContent = js.Any.fromFunction1(queryContent), queryContentProvider = js.Any.fromFunction1(queryContentProvider), queryContentProviders = queryContentProviders.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), registerContentProvider = js.Any.fromFunction3(registerContentProvider), release = release.toJsFn, releaseCommandIdentifier = js.Any.fromFunction1((t0: Double) => releaseCommandIdentifier(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[UniversalContentBroker]
  }
  
  extension [Self <: UniversalContentBroker](x: Self) {
    
    inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
  }
}
