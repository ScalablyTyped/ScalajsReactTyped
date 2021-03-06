package typingsJapgolly.openui5.sap.ui.test

import typingsJapgolly.openui5.sap.ui.base.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.gherkin")
@js.native
object gherkin extends js.Object {
  @js.native
  /**
    * A Gherkin feature file is human-readable, and the computer does not know how to execute its steps.
    * ThisStepDefinitions class provides the interface between human and machine. It defines what each
    * step in the Gherkinfeature file will actually do when it is executed.Meant to be
    * implemented/overridden by a child object. Specifically, the functions 'init' and
    * 'closeApplication'need to be overridden.
    */
  abstract class StepDefinitions () extends Object {
    /**
      * Closes the application and cleans up any mess made by the tests. To avoid erroneous exceptions
      * during testexecution, make sure that it is safe to run this method even if the application was never
      * started.
      */
    def closeApplication(): Unit = js.native
    /**
      * Registers the step definitions by calling the method 'register'. The order of the register calls is
      * important.The first step definition whose regular expression matches the step text is the one that
      * will be executed,however, the step definitions are checked in REVERSE ORDER (i.e. the last one you
      * wrote is checked first).
      */
    def init(): Unit = js.native
    /**
      * Registers a step definition.
      * @param rRegex the regular expression that matches the feature file step (with leading 'Given',
      * 'When',                         'Then' or 'But' removed). E.g. if the feature file has the step     
      *                    "Then I should be served a coffee" it will truncated to "I should be served a
      * coffee"                         and tested against 'rRegex' to check for a match. The simple regular
      * expression                         /^I should be served a coffee$/i would match this text. The
      * regular                         expression can specify capturing groups, which will be passed as
      * parameters to 'fnFunc'.
      * @param fnFunc the function to execute in the event that the regular expression matches. Receives    
      *                       regular expression capturing groups as parameters in the same order that they
      * are                           specified in the regular expression. If a data table is specified for
      * the step, it                           will be passed as an additional final parameter. At execution
      * time, all functions                           within a particular scenario will execute within the
      * same 'this' context.
      */
    def register(rRegex: js.RegExp, fnFunc: js.Any): Unit = js.native
  }
  
  @js.native
  object dataTableUtils extends js.Object {
    /**
      * Takes the inputed 2D list 'aData' and returns an equivalent object. Each row of data is expected
      * tobe a property-value pair. To create nested objects, add extra columns to the data. E.g.<pre> [  
      * ['Name', 'Alice'],   ['Mass', '135 lbs'],   ['Telephone Number', 'Home', '123-456-7890'],  
      * ['Telephone Number', 'Work', '123-456-0987'] ]</pre>For each data row, the right-most element
      * becomes a property value, and everything else is a propertyname. The property names get normalized
      * according to the strategy defined by the parameter 'oNorm'.E.g. using camelCase strategy<pre>  {   
      * name: 'Alice',    mass: '135 lbs',    telephoneNumber: {      home: '123-456-7890',      work:
      * '123-456-0987'    }  }</pre>
      * @param aData the input data to be converted
      * @param oNorm the normalization function to use to normalize property                                
      *             names. Can also be a string with values 'titleCase', 'pascalCase',                      
      *                       'camelCase', 'hyphenated' or 'none'.
      * @returns - an object equivalent to the input data, with property names normalized
      */
    def toObject(aData: js.Array[js.Array[String]]): js.Any = js.native
    def toObject(aData: js.Array[js.Array[String]], oNorm: String): js.Any = js.native
    def toObject(aData: js.Array[js.Array[String]], oNorm: js.Any): js.Any = js.native
    /**
      * Takes the inputed 2D list 'aData' and returns an equivalent list of objects. The data is expected
      * tohave a header row, with each subsequent row being an entity, and each column being a property of
      * thatentity. E.g.<pre>  [    ["Their Name",  "Their Age"],    ["Alice",       "16"],    ["Bob",      
      *   "22"]  ]</pre>The data's column headers become the returned objects' property names. The property
      * names get normalizedaccording to the strategy defined by the parameter 'oNorm'. E.g. using
      * hyphenation strategy this is returned:<pre>  [    {their-name: "Alice", their-age: "16"},   
      * {their-name: "Bob", their-age: "22"}  ]</pre>
      * @param aData the input data to be converted, with a header row
      * @param oNorm the normalization function to use to normalize property                                
      *             names. Can also be a String with values 'titleCase', 'pascalCase',                      
      *                       'camelCase', 'hyphenated' or 'none'.
      * @returns - a list of objects equivalent to the input data, with property names normalized
      */
    def toTable(aData: js.Array[js.Array[String]]): js.Array[_] = js.native
    def toTable(aData: js.Array[js.Array[String]], oNorm: String): js.Array[_] = js.native
    def toTable(aData: js.Array[js.Array[String]], oNorm: js.Any): js.Array[_] = js.native
    @js.native
    object normalization extends js.Object {
      /**
        * e.g. "First Name" -> "firstName"
        * @param sString the string to normalize
        * @returns the input string with all words after the first capitalized and all spaces removed
        */
      def camelCase(sString: String): String = js.native
      /**
        * e.g. "First Name" -> "first-name"
        * @param sString the string to normalize
        * @returns the input string trimmed, changed to lower case and with space between words               
        *   replaced by a hyphen ('-')
        */
      def hyphenated(sString: String): String = js.native
      /**
        * e.g. "First Name" -> "First Name"
        * @param sString the string to normalize
        * @returns the original unchanged input string
        */
      def none(sString: String): String = js.native
      /**
        * e.g. "first name" -> "FirstName"
        * @param sString the string to normalize
        * @returns the input string with all words capitalized and all spaces removed
        */
      def pascalCase(sString: String): String = js.native
      /**
        * e.g. "first name" -> "First Name"
        * @param sString the string to normalize
        * @returns the input string trimmed and with all words capitalized
        */
      def titleCase(sString: String): String = js.native
    }
    
  }
  
  @js.native
  object opa5TestHarness extends js.Object {
    /**
      * Dynamically generates Opa5 testsIf a test step is missing and args.generateMissingSteps is true then
      * the  Gherkin step will be converted into OpaPage Object code and executed. The text will be
      * converted to camelCase and have any non-alphanumeric characterremoved. Here are two pertinent
      * examples:(1) The simple step "Given I start my app" will be converted into the call
      * "Given.iStartMyApp();"(2) The step "Then on page 1: I should see the page 1 text" will become the
      * call    "Then.onPage1.iShouldSeeThePage1Text();"Chaining function calls, such as
      * "Then.iStartMyApp().and.iCloseMyApp()" is not possible at this time.
      * @param args the arguments to the function
      */
    def test(args: js.Any): Unit = js.native
  }
  
  @js.native
  object qUnitTestHarness extends js.Object {
    /**
      * Dynamically generates and executes QUnit tests
      * @param args the arguments to the function
      */
    def test(args: js.Any): Unit = js.native
  }
  
}

