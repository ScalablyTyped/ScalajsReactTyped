package typingsJapgolly.fhirJsClient.FHIR.SMART

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FHIR API instance which can be used to make API calls to the FHIR server.
  * This exposes all the methods implemented by jqFhir.js adapter of fhir.js client library
  * https://github.com/FHIR/fhir.js
  */
trait Api extends StObject {
  
  /**
    * GET BASEURL/metadata
    *
    * @param input : An override to the base config object or just an empty object {}
    */
  def conformance(input: Any): js.Promise[Response]
  
  /**
    * POST BASEURL/{resourceType} BODY: {entry without id}
    * @param entry : A valid FHIR entry containing the resource.
    */
  def create(entry: Entry): js.Promise[Response]
  
  /**
    * DELETE BASEURL/{resourceType} BODY {entry with id}
    * @param entry : A valid FHIR entry object containing the resource object
    * or an object containing the id property(id of the resource to be deleted)
    */
  def delete(entry: Entry): js.Promise[Response]
  
  /**
    * POST BASEURL/Document
    * @param document
    */
  def document(document: Entry): js.Promise[Response]
  
  /**
    * GET BASEURL/{resourceType}?searchParams
    * Fetch all the resources based on the search parameter (keeps on calling next method to gett all the pages)
    * and process the result set of each page
    * @param params Search Parameter, same as parameter of the Search method
    * @param process Function called by passing the result set of each page fetched.
    * @param done Function called once all the resources are fetched
    * @param fail Function called when an error occurs in the process
    */
  def drain(
    params: SearchParams,
    process: js.Function1[/* entries */ js.Array[Entry], Any],
    done: js.Function0[Any],
    fail: js.Function1[/* error */ Any, Any]
  ): Unit
  
  /**
    * GET BASEURL/{resourceType}?searchParams
    * Fetch all the resources of a particular resource type and that meets the search filter.
    * @param params Search Parameter, same as parameter of the Search method
    * Returns a promise
    * Resolve: (entries:any[]) => { console.log(entries); }
    * Reject: (error:any) => { console.log(error); }
    */
  def fetchAll(params: SearchParams): js.Promise[js.Array[Entry]]
  
  /**
    * GET BASEURL/{resourceType}?searchParams
    * GET BASEURL/{referencedType} referencedType based on the resolveParams
    * @param params Search Parameter, same as parameter of the Search method
    * @param resolveParams Resolve Parameter, an array of string containing the each parameter in the format TargetResourceType.TargetElement
    * eg. ['Observation.subject',Observation.context']
    * Returns a promise.
    * Resolve: (entries:Entry[],resolvedReferences:[index: string]: Resource) => { console.log(entries); console.log(resolvedReferences);}
    * Reject: (error:any) => { console.log(error); }
    */
  def fetchAllWithReferences(params: SearchParams, resolveParams: js.Array[String]): Any
  
  /**
    * GET BASEURL/_history?historyParams
    * Calls the _history API with the parameters specified
    * @param params
    */
  def history(params: HistoryParams): js.Promise[Response]
  
  /**
    * GET BASEURL/_getpages=XXXX : Next link in the bundle
    * Fetches the next page based on the input bundle resource's next link.
    * @param bundle Input bundle resource containing the next link.
    */
  def nextPage(bundle: Bundle): js.Promise[Response]
  
  /**
    * GET BASEURL/_getpages=XXXX : Prev link in the bundle
    * Fetches the previous page based on the input bundle resource's previous link.
    * @param bundle Input bundle resource containing the previous link
    */
  def prevPage(bundle: Bundle): js.Promise[Response]
  
  /**
    * GET BASEURL/Profile/{resourceType}
    * @param resourceType
    */
  def profile(resourceType: ResourceType): js.Promise[Response]
  
  /**
    * GET BASEURL/{resourceType}/{id}
    * @param params An object with id and resourceType property
    */
  def read(params: ReadParams): js.Promise[Response]
  
  /**
    * Pass the node containing the property reference, which needs to be resolved. eg. myObservation.resource.subject
    * The resource node should be present if the reference is contained within the resource.
    * If a bundle resource is passed, will try to resolve within that bundle first before querying the server
    * @param params The reference node to be resolved along with the resource and the bundle to be searched if the reference is a contained one.
    */
  def resolve(params: ResolveParams): js.Promise[Response]
  
  /**
    * GET BASEURL/{resourceType}/{id}/_history?otherHistoryParams
    * @param params Should provide, resourceType and id either through id and type properties or the resource property
    */
  def resourceHistory(params: HistoryParams): js.Promise[Response]
  
  /**
    * GET BASEURL/{resourceType}?searchParams
    * @param searchParams Filters to be applied to the API call
    */
  def search(params: SearchParams): js.Promise[Response]
  
  /**
    * POST BASEURL Body: Bundle with entries containing a node 'request': { 'method': 'POST' }. The value of 'method' can be DELETE,POST,PUT or GET.
    * @param bundle
    */
  def transaction(bundle: Bundle): js.Promise[Response]
  
  /**
    * GET BASEURL/{resourceType}/_history?historyParams
    * @param params
    */
  def typeHistory(params: HistoryParams): js.Promise[Response]
  
  /**
    * PUT BASEURL/{resourceType}/{id}
    * @param entry : Entry containing the Resource to be updated
    */
  def update(entry: Entry): js.Promise[Response]
  
  /**
    * POST BASEURL/{resourceType}/_validate BODY: Resource to be validated
    * PS: Cannot find the _validate endpoint on the SMART on FHIR open server. But $validate exists.
    * @param entry
    */
  def validate(entry: Entry): js.Promise[Response]
  
  /**
    * GET BASEURL/{resourceType}/{id}/_history/{versionId}
    * Fetches the specific historic version of the resource.
    * @param params ResourceType, ResourceId and the VersionId
    */
  def vread(params: VersionReadParams): js.Promise[Response]
}
object Api {
  
  inline def apply(
    conformance: Any => js.Promise[Response],
    create: Entry => js.Promise[Response],
    delete: Entry => js.Promise[Response],
    document: Entry => js.Promise[Response],
    drain: (SearchParams, js.Function1[/* entries */ js.Array[Entry], Any], js.Function0[Any], js.Function1[/* error */ Any, Any]) => Callback,
    fetchAll: SearchParams => js.Promise[js.Array[Entry]],
    fetchAllWithReferences: (SearchParams, js.Array[String]) => Any,
    history: HistoryParams => js.Promise[Response],
    nextPage: Bundle => js.Promise[Response],
    prevPage: Bundle => js.Promise[Response],
    profile: ResourceType => js.Promise[Response],
    read: ReadParams => js.Promise[Response],
    resolve: ResolveParams => js.Promise[Response],
    resourceHistory: HistoryParams => js.Promise[Response],
    search: SearchParams => js.Promise[Response],
    transaction: Bundle => js.Promise[Response],
    typeHistory: HistoryParams => js.Promise[Response],
    update: Entry => js.Promise[Response],
    validate: Entry => js.Promise[Response],
    vread: VersionReadParams => js.Promise[Response]
  ): Api = {
    val __obj = js.Dynamic.literal(conformance = js.Any.fromFunction1(conformance), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), document = js.Any.fromFunction1(document), drain = js.Any.fromFunction4((t0: SearchParams, t1: js.Function1[/* entries */ js.Array[Entry], Any], t2: js.Function0[Any], t3: js.Function1[/* error */ Any, Any]) => (drain(t0, t1, t2, t3)).runNow()), fetchAll = js.Any.fromFunction1(fetchAll), fetchAllWithReferences = js.Any.fromFunction2(fetchAllWithReferences), history = js.Any.fromFunction1(history), nextPage = js.Any.fromFunction1(nextPage), prevPage = js.Any.fromFunction1(prevPage), profile = js.Any.fromFunction1(profile), read = js.Any.fromFunction1(read), resolve = js.Any.fromFunction1(resolve), resourceHistory = js.Any.fromFunction1(resourceHistory), search = js.Any.fromFunction1(search), transaction = js.Any.fromFunction1(transaction), typeHistory = js.Any.fromFunction1(typeHistory), update = js.Any.fromFunction1(update), validate = js.Any.fromFunction1(validate), vread = js.Any.fromFunction1(vread))
    __obj.asInstanceOf[Api]
  }
  
  extension [Self <: Api](x: Self) {
    
    inline def setConformance(value: Any => js.Promise[Response]): Self = StObject.set(x, "conformance", js.Any.fromFunction1(value))
    
    inline def setCreate(value: Entry => js.Promise[Response]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setDelete(value: Entry => js.Promise[Response]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setDocument(value: Entry => js.Promise[Response]): Self = StObject.set(x, "document", js.Any.fromFunction1(value))
    
    inline def setDrain(
      value: (SearchParams, js.Function1[/* entries */ js.Array[Entry], Any], js.Function0[Any], js.Function1[/* error */ Any, Any]) => Callback
    ): Self = StObject.set(x, "drain", js.Any.fromFunction4((t0: SearchParams, t1: js.Function1[/* entries */ js.Array[Entry], Any], t2: js.Function0[Any], t3: js.Function1[/* error */ Any, Any]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setFetchAll(value: SearchParams => js.Promise[js.Array[Entry]]): Self = StObject.set(x, "fetchAll", js.Any.fromFunction1(value))
    
    inline def setFetchAllWithReferences(value: (SearchParams, js.Array[String]) => Any): Self = StObject.set(x, "fetchAllWithReferences", js.Any.fromFunction2(value))
    
    inline def setHistory(value: HistoryParams => js.Promise[Response]): Self = StObject.set(x, "history", js.Any.fromFunction1(value))
    
    inline def setNextPage(value: Bundle => js.Promise[Response]): Self = StObject.set(x, "nextPage", js.Any.fromFunction1(value))
    
    inline def setPrevPage(value: Bundle => js.Promise[Response]): Self = StObject.set(x, "prevPage", js.Any.fromFunction1(value))
    
    inline def setProfile(value: ResourceType => js.Promise[Response]): Self = StObject.set(x, "profile", js.Any.fromFunction1(value))
    
    inline def setRead(value: ReadParams => js.Promise[Response]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setResolve(value: ResolveParams => js.Promise[Response]): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    
    inline def setResourceHistory(value: HistoryParams => js.Promise[Response]): Self = StObject.set(x, "resourceHistory", js.Any.fromFunction1(value))
    
    inline def setSearch(value: SearchParams => js.Promise[Response]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    
    inline def setTransaction(value: Bundle => js.Promise[Response]): Self = StObject.set(x, "transaction", js.Any.fromFunction1(value))
    
    inline def setTypeHistory(value: HistoryParams => js.Promise[Response]): Self = StObject.set(x, "typeHistory", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: Entry => js.Promise[Response]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    inline def setValidate(value: Entry => js.Promise[Response]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setVread(value: VersionReadParams => js.Promise[Response]): Self = StObject.set(x, "vread", js.Any.fromFunction1(value))
  }
}
