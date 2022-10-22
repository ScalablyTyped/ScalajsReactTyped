package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object submission {
  
  /** is implemented by components which support submitting data. */
  trait XSubmission
    extends StObject
       with XInterface {
    
    /**
      * registers the given listener to be notified when a submission occurs
      * @param listener the listener to register
      * @throws com::sun::star::lang::NoSupportException when the component does not support external components vetoing the submission
      */
    def addSubmissionVetoListener(listener: XSubmissionVetoListener): Unit
    
    /**
      * revokes a listener which has previously been registered to be notified when a submission occurs
      * @param listener the listener to revoke
      * @throws com::sun::star::lang::NoSupportException when the component does not support external components vetoing the submission
      */
    def removeSubmissionVetoListener(listener: XSubmissionVetoListener): Unit
    
    /**
      * tells the component to submit data
      * @throws com::sun::star::util::VetoException if the submission has been vetoed. Usually, this indicates that not all requirements for the submission, e.g.
      * @throws com::sun::star::lang::WrappedTargetException if an error occurred during invoking the submission target
      */
    def submit(): Unit
    
    /**
      * tells the component to submit data
      * @param aHandler This handler allows additional user interaction, which may be necessary before the submission can be performed.
      * @throws com::sun::star::util::VetoException if the submission has been vetoed. Usually, this indicates that not all requirements for the submission, e.g.
      * @throws com::sun::star::lang::WrappedTargetException if an error occurred during invoking the submission target
      */
    def submitWithInteraction(aHandler: XInteractionHandler): Unit
  }
  object XSubmission {
    
    inline def apply(
      acquire: Callback,
      addSubmissionVetoListener: XSubmissionVetoListener => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeSubmissionVetoListener: XSubmissionVetoListener => Callback,
      submit: Callback,
      submitWithInteraction: XInteractionHandler => Callback
    ): XSubmission = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addSubmissionVetoListener = js.Any.fromFunction1((t0: XSubmissionVetoListener) => addSubmissionVetoListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeSubmissionVetoListener = js.Any.fromFunction1((t0: XSubmissionVetoListener) => removeSubmissionVetoListener(t0).runNow()), submit = submit.toJsFn, submitWithInteraction = js.Any.fromFunction1((t0: XInteractionHandler) => submitWithInteraction(t0).runNow()))
      __obj.asInstanceOf[XSubmission]
    }
    
    extension [Self <: XSubmission](x: Self) {
      
      inline def setAddSubmissionVetoListener(value: XSubmissionVetoListener => Callback): Self = StObject.set(x, "addSubmissionVetoListener", js.Any.fromFunction1((t0: XSubmissionVetoListener) => value(t0).runNow()))
      
      inline def setRemoveSubmissionVetoListener(value: XSubmissionVetoListener => Callback): Self = StObject.set(x, "removeSubmissionVetoListener", js.Any.fromFunction1((t0: XSubmissionVetoListener) => value(t0).runNow()))
      
      inline def setSubmit(value: Callback): Self = StObject.set(x, "submit", value.toJsFn)
      
      inline def setSubmitWithInteraction(value: XInteractionHandler => Callback): Self = StObject.set(x, "submitWithInteraction", js.Any.fromFunction1((t0: XInteractionHandler) => value(t0).runNow()))
    }
  }
  
  /**
    * is implemented by a component which allows access to a component which can submit data.
    * @see XSubmission
    */
  trait XSubmissionSupplier
    extends StObject
       with XInterface {
    
    /** specifies the {@link XSubmission} instance to which the submission request should be delegated. */
    var Submission: XSubmission
  }
  object XSubmissionSupplier {
    
    inline def apply(Submission: XSubmission, acquire: Callback, queryInterface: `type` => Any, release: Callback): XSubmissionSupplier = {
      val __obj = js.Dynamic.literal(Submission = Submission.asInstanceOf[js.Any], acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XSubmissionSupplier]
    }
    
    extension [Self <: XSubmissionSupplier](x: Self) {
      
      inline def setSubmission(value: XSubmission): Self = StObject.set(x, "Submission", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * is implement by components which want to observe (and probably veto) the submission of data.
    * @see XSubmission
    */
  trait XSubmissionVetoListener
    extends StObject
       with XEventListener {
    
    /**
      * is invoked when a component, at which the listener has been registered, is about to submit its data.
      * @param event The submission event. The {@link com.sun.star.lang.EventObject.Source} member of the structure describes the component which is about to su
      * @throws com::sun::star::util::VetoException when the submission is vetoed. {@link com.sun.star.uno.Exception.Message} should contain a justification for
      */
    def submitting(event: EventObject): Unit
  }
  object XSubmissionVetoListener {
    
    inline def apply(
      acquire: Callback,
      disposing: EventObject => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      submitting: EventObject => Callback
    ): XSubmissionVetoListener = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, submitting = js.Any.fromFunction1((t0: EventObject) => submitting(t0).runNow()))
      __obj.asInstanceOf[XSubmissionVetoListener]
    }
    
    extension [Self <: XSubmissionVetoListener](x: Self) {
      
      inline def setSubmitting(value: EventObject => Callback): Self = StObject.set(x, "submitting", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    }
  }
}
