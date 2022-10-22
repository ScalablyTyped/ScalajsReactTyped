package typingsJapgolly.cypressAxe

import typingsJapgolly.axeCore.mod.AxePlugin
import typingsJapgolly.axeCore.mod.AxeResults
import typingsJapgolly.axeCore.mod.ElementContext
import typingsJapgolly.axeCore.mod.FrameMessenger_
import typingsJapgolly.axeCore.mod.PartialResult
import typingsJapgolly.axeCore.mod.PartialResults
import typingsJapgolly.axeCore.mod.RuleMetadata
import typingsJapgolly.axeCore.mod.RunCallback
import typingsJapgolly.axeCore.mod.RunOptions
import typingsJapgolly.axeCore.mod.Spec
import typingsJapgolly.axeCore.mod.Utils_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofaxe extends StObject {
    
    /**
      * Object for axe Results
      */
    var AxeResults: typingsJapgolly.axeCore.mod.AxeResults = js.native
    
    /**
      * Function to clean up plugin configuration in document and its subframes
      */
    def cleanup(): Unit = js.native
    
    /**
      * Method for configuring the data format used by axe. Helpful for adding new
      * rules, which must be registered with the library to execute.
      * @param  {Spec}       Spec Object with valid `branding`, `reporter`, `checks` and `rules` data
      */
    def configure(spec: Spec): Unit = js.native
    
    /**
      * Create a report from axe.runPartial results
      * @param   {PartialResult[]}     partialResults  Results from axe.runPartial, calls in different frames on the page.
      * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
      */
    def finishRun(partialResults: PartialResults, options: RunOptions): js.Promise[AxeResults] = js.native
    
    /**
      * Set up alternative frame communication
      */
    def frameMessenger(frameMessenger: FrameMessenger_): Unit = js.native
    
    /**
      * Searches and returns rules that contain a tag in the list of tags.
      * @param  {Array}  tags  Optional array of tags
      * @return {Array}  Array of rules
      */
    def getRules(): js.Array[RuleMetadata] = js.native
    def getRules(tags: js.Array[String]): js.Array[RuleMetadata] = js.native
    
    var plugins: Any = js.native
    
    /**
      * Function to register a plugin configuration in document and its subframes
      * @param  {Object}    plugin    A plugin configuration object
      */
    def registerPlugin(plugin: AxePlugin): Unit = js.native
    
    /**
      * Restores the default axe configuration
      */
    def reset(): Unit = js.native
    
    /**
      * Runs a number of rules against the provided HTML page and returns the resulting issue list
      *
      * @param   {ElementContext} context  Optional The `Context` specification object @see Context
      * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
      * @param   {RunCallback}    callback Optional The function to invoke when analysis is complete.
      * @returns {Promise<AxeResults>|void} If the callback was not defined, axe will return a Promise.
      */
    def run(): js.Promise[AxeResults] = js.native
    def run(callback: js.Function2[/* error */ js.Error, /* results */ AxeResults, Unit]): Unit = js.native
    def run(context: ElementContext): js.Promise[AxeResults] = js.native
    def run(context: ElementContext, callback: RunCallback): Unit = js.native
    def run(context: ElementContext, options: RunOptions): js.Promise[AxeResults] = js.native
    def run(context: ElementContext, options: RunOptions, callback: RunCallback): Unit = js.native
    def run(options: RunOptions): js.Promise[AxeResults] = js.native
    def run(options: RunOptions, callback: RunCallback): Unit = js.native
    
    /**
      * Run axe in the current window only
      * @param   {ElementContext} context  Optional The `Context` specification object @see Context
      * @param   {RunOptions}     options  Optional Options passed into rules or checks, temporarily modifying them.
      * @returns {Promise<PartialResult>}  Partial result, for use in axe.finishRun.
      */
    def runPartial(context: ElementContext, options: RunOptions): js.Promise[PartialResult] = js.native
    
    /**
      * Source string to use as an injected script in Selenium
      */
    var source: String = js.native
    
    var utils: Utils_ = js.native
    
    var version: String = js.native
  }
}
