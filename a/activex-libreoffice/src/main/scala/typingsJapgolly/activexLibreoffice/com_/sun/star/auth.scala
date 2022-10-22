package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auth {
  
  /**
    * indicates failure to authenticate using the specified security context.
    * @since OOo 1.1.2
    */
  type AuthenticationFailedException = Exception
  
  /**
    * indicates an invalid argument was passed to SSO API.
    * @since OOo 1.1.2
    */
  type InvalidArgumentException = Exception
  
  /**
    * indicates an attempt was made to use an invalid source or target context.
    * @since OOo 1.1.2
    */
  type InvalidContextException = Exception
  
  /**
    * indicates an attempt was made to use an invalid or non existent credential.
    * @since OOo 1.1.2
    */
  type InvalidCredentialException = Exception
  
  /**
    * indicates an invalid principal was specified.
    * @since OOo 1.1.2
    */
  type InvalidPrincipalException = Exception
  
  /**
    * indicates an underlying persistence implementation failure.
    * @since OOo 1.1.2
    */
  type PersistenceFailureException = Exception
  
  /**
    * represents a starting point for Single Sign-on interactions.
    *
    * The Single Sign-on ( SSO ) APIs provide UNO based access to underlying SSO implementations ( e.g. Kerberos ). The aim of the SSO APIs is to enable
    * authentication ( possibly mutual ) between a client ( source or initiator ) and a network service ( target or acceptor ). This is achieved via. the
    * creation and processing of security tokens sent between the two parties. The steps which should be followed to successfully use the SSO APIs are as
    * follows: Create an {@link XSSOManagerFactory} instanceUse this factory to create/retrieve an {@link XSSOManager} instance.Depending on whether your
    * code is acting as SSO source or target, you should use the {@link XSSOManager} instance to create an initiator security context, {@link
    * XSSOInitiatorContext} or an acceptor security context, {@link XSSOAcceptorContext} respectively.On the initiator side, use the previously created
    * context to process security tokens received from the acceptor side and to create security tokens to send to the acceptor side. On the acceptor side,
    * use the previously created context to process security tokens received from the initiator side and to create security tokens to send to the initiator
    * side.
    *
    * The interface supports the creation of {@link XSSOManager} instances which can subsequently be used to create security contexts.
    * @since OOo 1.1.2
    */
  type SSOManagerFactory = XSSOManagerFactory
  
  /**
    * provided as a convenience for simple username/password based Single Sign-on implementations which don't provide some sort of authentication
    * information repository.
    *
    * provides access to a cache which maps usernames to associated passwords. Individual cache entries may be persisted.
    * @since OOo 1.1.2
    */
  type SSOPasswordCache = XSSOPasswordCache
  
  /**
    * indicates an operation unsupported by the implementation.
    * @since OOo 1.1.2
    */
  type UnsupportedException = Exception
  
  /**
    * represents an acceptor side security context.
    *
    * This context may be used to authenticate a Single Sign-on initiator based on a security token sent by the initiator and to generate a token to be sent
    * back to the initiator so that it can authenticate the acceptor.
    * @since OOo 1.1.2
    */
  trait XSSOAcceptorContext
    extends StObject
       with XSSOContext {
    
    /**
      * accepts/authenticates an SSO token sent from the context initiator side.
      *
      * {@link accept()} should be called only once. Subsequent calls produce undefined results.
      * @param Token the SSO token sent by the initiator.
      * @returns the sequence of bytes to be sent back to the initiator to allow authentication of the acceptor side, if mutual authentication is supported by the
      */
    def accept(Token: SeqEquiv[Double]): SafeArray[Double]
  }
  object XSSOAcceptorContext {
    
    inline def apply(
      Mechanism: String,
      Mutual: Boolean,
      Source: String,
      Target: String,
      accept: SeqEquiv[Double] => SafeArray[Double],
      acquire: Callback,
      getMechanism: CallbackTo[String],
      getMutual: CallbackTo[Boolean],
      getSource: CallbackTo[String],
      getTarget: CallbackTo[String],
      queryInterface: `type` => Any,
      release: Callback
    ): XSSOAcceptorContext = {
      val __obj = js.Dynamic.literal(Mechanism = Mechanism.asInstanceOf[js.Any], Mutual = Mutual.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], accept = js.Any.fromFunction1(accept), acquire = acquire.toJsFn, getMechanism = getMechanism.toJsFn, getMutual = getMutual.toJsFn, getSource = getSource.toJsFn, getTarget = getTarget.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XSSOAcceptorContext]
    }
    
    extension [Self <: XSSOAcceptorContext](x: Self) {
      
      inline def setAccept(value: SeqEquiv[Double] => SafeArray[Double]): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Base SSO security context representation
    * @since OOo 1.1.2
    */
  trait XSSOContext
    extends StObject
       with XInterface {
    
    /**
      * retrieves the mechanism associated with the context.
      * @returns the mechanism name
      */
    val Mechanism: String
    
    /**
      * retrieves whether or not the context supports mutual authentication
      * @returns `TRUE` if mutual authentication is supported, `FALSE` otherwise.
      */
    val Mutual: Boolean
    
    /**
      * retrieves the principal name of the source/initiator of the context.
      *
      * In the case of an acceptor side security context, the source principal name is available only after the initiator has been authenticated.
      * @returns the source principal name
      */
    val Source: String
    
    /**
      * retrieves the principal name of the target/acceptor of the context.
      * @returns the target principal name
      */
    val Target: String
    
    /**
      * retrieves the mechanism associated with the context.
      * @returns the mechanism name
      */
    def getMechanism(): String
    
    /**
      * retrieves whether or not the context supports mutual authentication
      * @returns `TRUE` if mutual authentication is supported, `FALSE` otherwise.
      */
    def getMutual(): Boolean
    
    /**
      * retrieves the principal name of the source/initiator of the context.
      *
      * In the case of an acceptor side security context, the source principal name is available only after the initiator has been authenticated.
      * @returns the source principal name
      */
    def getSource(): String
    
    /**
      * retrieves the principal name of the target/acceptor of the context.
      * @returns the target principal name
      */
    def getTarget(): String
  }
  object XSSOContext {
    
    inline def apply(
      Mechanism: String,
      Mutual: Boolean,
      Source: String,
      Target: String,
      acquire: Callback,
      getMechanism: CallbackTo[String],
      getMutual: CallbackTo[Boolean],
      getSource: CallbackTo[String],
      getTarget: CallbackTo[String],
      queryInterface: `type` => Any,
      release: Callback
    ): XSSOContext = {
      val __obj = js.Dynamic.literal(Mechanism = Mechanism.asInstanceOf[js.Any], Mutual = Mutual.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMechanism = getMechanism.toJsFn, getMutual = getMutual.toJsFn, getSource = getSource.toJsFn, getTarget = getTarget.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XSSOContext]
    }
    
    extension [Self <: XSSOContext](x: Self) {
      
      inline def setGetMechanism(value: CallbackTo[String]): Self = StObject.set(x, "getMechanism", value.toJsFn)
      
      inline def setGetMutual(value: CallbackTo[Boolean]): Self = StObject.set(x, "getMutual", value.toJsFn)
      
      inline def setGetSource(value: CallbackTo[String]): Self = StObject.set(x, "getSource", value.toJsFn)
      
      inline def setGetTarget(value: CallbackTo[String]): Self = StObject.set(x, "getTarget", value.toJsFn)
      
      inline def setMechanism(value: String): Self = StObject.set(x, "Mechanism", value.asInstanceOf[js.Any])
      
      inline def setMutual(value: Boolean): Self = StObject.set(x, "Mutual", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * represents an initiator side security context.
    *
    * This context may be used to initialize authentication tokens to send to an acceptor and to authenticate any token sent back in response.
    * @since OOo 1.1.2
    */
  trait XSSOInitiatorContext
    extends StObject
       with XSSOContext {
    
    /**
      * initializes an SSO Token to send to the acceptor side and authenticates an SSO Token returned by the acceptor if the context supports mutual
      * authentication.
      *
      * init should be called only once for contexts which don't support mutual authentication and at most twice for contexts which do support mutual
      * authentication. Additional calls produce undefined results.
      * @param Token the SSO token received from the acceptor side in response to an authentication request. This token is ignored on the first call to init and
      * @returns the sequence of bytes to be sent to the acceptor side as part of an authentication request. This sequence will be non zero length for the first c
      */
    def init(Token: SeqEquiv[Double]): SafeArray[Double]
  }
  object XSSOInitiatorContext {
    
    inline def apply(
      Mechanism: String,
      Mutual: Boolean,
      Source: String,
      Target: String,
      acquire: Callback,
      getMechanism: CallbackTo[String],
      getMutual: CallbackTo[Boolean],
      getSource: CallbackTo[String],
      getTarget: CallbackTo[String],
      init: SeqEquiv[Double] => SafeArray[Double],
      queryInterface: `type` => Any,
      release: Callback
    ): XSSOInitiatorContext = {
      val __obj = js.Dynamic.literal(Mechanism = Mechanism.asInstanceOf[js.Any], Mutual = Mutual.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMechanism = getMechanism.toJsFn, getMutual = getMutual.toJsFn, getSource = getSource.toJsFn, getTarget = getTarget.toJsFn, init = js.Any.fromFunction1(init), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XSSOInitiatorContext]
    }
    
    extension [Self <: XSSOInitiatorContext](x: Self) {
      
      inline def setInit(value: SeqEquiv[Double] => SafeArray[Double]): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * supports the creation of security contexts for both the initiator/source side and the acceptor/target side.
    * @since OOo 1.1.2
    */
  trait XSSOManager
    extends StObject
       with XInterface {
    
    /**
      * retrieves the mechanism name of all security contexts created using this manager.
      * @returns the mechanism name ( e.g. "KERBEROS" )
      */
    val Mechanism: String
    
    /**
      * creates an acceptor side security context.
      * @param TargetPrincipal the name of the acceptor side principal.
      * @returns the newly created acceptor side context.
      */
    def createAcceptorContext(TargetPrincipal: String): XSSOAcceptorContext
    
    /**
      * creates an initiator side security context.
      * @param SourcePrincipal the name of the initiator side principal for which the context will be created.
      * @param TargetPrincipal the name of the target/acceptor side principal to which the source principal intends to authenticate.
      * @param TargetHost the host name associated with the target principal.
      * @returns the newly created initiator context.
      */
    def createInitiatorContext(SourcePrincipal: String, TargetPrincipal: String, TargetHost: String): XSSOInitiatorContext
    
    /**
      * retrieves the mechanism name of all security contexts created using this manager.
      * @returns the mechanism name ( e.g. "KERBEROS" )
      */
    def getMechanism(): String
  }
  object XSSOManager {
    
    inline def apply(
      Mechanism: String,
      acquire: Callback,
      createAcceptorContext: String => XSSOAcceptorContext,
      createInitiatorContext: (String, String, String) => XSSOInitiatorContext,
      getMechanism: CallbackTo[String],
      queryInterface: `type` => Any,
      release: Callback
    ): XSSOManager = {
      val __obj = js.Dynamic.literal(Mechanism = Mechanism.asInstanceOf[js.Any], acquire = acquire.toJsFn, createAcceptorContext = js.Any.fromFunction1(createAcceptorContext), createInitiatorContext = js.Any.fromFunction3(createInitiatorContext), getMechanism = getMechanism.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XSSOManager]
    }
    
    extension [Self <: XSSOManager](x: Self) {
      
      inline def setCreateAcceptorContext(value: String => XSSOAcceptorContext): Self = StObject.set(x, "createAcceptorContext", js.Any.fromFunction1(value))
      
      inline def setCreateInitiatorContext(value: (String, String, String) => XSSOInitiatorContext): Self = StObject.set(x, "createInitiatorContext", js.Any.fromFunction3(value))
      
      inline def setGetMechanism(value: CallbackTo[String]): Self = StObject.set(x, "getMechanism", value.toJsFn)
      
      inline def setMechanism(value: String): Self = StObject.set(x, "Mechanism", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Factory for creating an SSO Manager supporting the user's configured security mechanism
    * @since OOo 1.1.2
    */
  trait XSSOManagerFactory
    extends StObject
       with XInterface {
    
    /**
      * provides a {@link XSSOManager} to be used in subsequent security context creation.
      * @returns the relevant {@link XSSOManager} instance
      */
    val SSOManager: XSSOManager
    
    /**
      * provides a {@link XSSOManager} to be used in subsequent security context creation.
      * @returns the relevant {@link XSSOManager} instance
      */
    def getSSOManager(): XSSOManager
  }
  object XSSOManagerFactory {
    
    inline def apply(
      SSOManager: XSSOManager,
      acquire: Callback,
      getSSOManager: CallbackTo[XSSOManager],
      queryInterface: `type` => Any,
      release: Callback
    ): XSSOManagerFactory = {
      val __obj = js.Dynamic.literal(SSOManager = SSOManager.asInstanceOf[js.Any], acquire = acquire.toJsFn, getSSOManager = getSSOManager.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XSSOManagerFactory]
    }
    
    extension [Self <: XSSOManagerFactory](x: Self) {
      
      inline def setGetSSOManager(value: CallbackTo[XSSOManager]): Self = StObject.set(x, "getSSOManager", value.toJsFn)
      
      inline def setSSOManager(value: XSSOManager): Self = StObject.set(x, "SSOManager", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * supports password caching for security mechanisms which use passwords as credentials or as an input to credential creation but don't have an external
    * method to cache these passwords.
    * @since OOo 1.1.2
    */
  trait XSSOPasswordCache
    extends StObject
       with XInterface {
    
    /**
      * adds a username/password combination to the cache.
      *
      * If an entry for the specified username already exists in the cache, it will be overwritten.
      * @param UserName the user name to add
      * @param Password the associated password
      * @param Persist indicates whether or not the username/password combination should be persisted
      */
    def addPassword(UserName: String, Password: String, Persist: Boolean): Unit
    
    /**
      * retrieves a password for a given user from the cache.
      *
      * Non persistent cache is searched first, followed by the persistent cache ( if it exists ).
      * @param UserName the name of the user whose password should be retrieved
      * @param Persist indicates whether or not the password is persistent
      * @returns the required password
      */
    def getPassword(UserName: String, Persist: js.Array[Boolean]): String
    
    /**
      * removes a password from the cache
      * @param UserName the name of the user whose password should be removed.
      * @param RemovePersist indicates whether or not the password should also be removed, if present, from persistent cache.
      */
    def removePassword(UserName: String, RemovePersist: Boolean): Unit
  }
  object XSSOPasswordCache {
    
    inline def apply(
      acquire: Callback,
      addPassword: (String, String, Boolean) => Callback,
      getPassword: (String, js.Array[Boolean]) => String,
      queryInterface: `type` => Any,
      release: Callback,
      removePassword: (String, Boolean) => Callback
    ): XSSOPasswordCache = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addPassword = js.Any.fromFunction3((t0: String, t1: String, t2: Boolean) => (addPassword(t0, t1, t2)).runNow()), getPassword = js.Any.fromFunction2(getPassword), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePassword = js.Any.fromFunction2((t0: String, t1: Boolean) => (removePassword(t0, t1)).runNow()))
      __obj.asInstanceOf[XSSOPasswordCache]
    }
    
    extension [Self <: XSSOPasswordCache](x: Self) {
      
      inline def setAddPassword(value: (String, String, Boolean) => Callback): Self = StObject.set(x, "addPassword", js.Any.fromFunction3((t0: String, t1: String, t2: Boolean) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetPassword(value: (String, js.Array[Boolean]) => String): Self = StObject.set(x, "getPassword", js.Any.fromFunction2(value))
      
      inline def setRemovePassword(value: (String, Boolean) => Callback): Self = StObject.set(x, "removePassword", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    }
  }
}
