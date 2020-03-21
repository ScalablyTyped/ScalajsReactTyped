package typingsJapgolly.ldapjsClient.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LdapClient extends js.Object {
  /**
    * Adds an entry to the LDAP server.
    */
  def add(dn: String, entry: js.Object): js.Promise[_]
  /**
    * Performs a simple authentication against the server.
    */
  def bind(dn: String, password: String): js.Promise[_]
  /**
    * Deletes an entry from the LDAP server.
    */
  def del(dn: String): js.Promise[_]
  /**
    * Disconnect from the LDAP server and do not allow reconnection.
    *
    * If the client is instantiated with proper reconnection options, it's
    * possible to initiate new requests after a call to unbind since the client
    * will attempt to reconnect in order to fulfill the request.
    *
    * Calling destroy will prevent any further reconnection from occurring.
    */
  def destroy(): js.Promise[Unit]
  /**
    * Performs an LDAP modify against the server.
    *
    * @param dn the DN of the entry to modify.
    * @param change update to perform (can be [Change]).
    */
  def modify(dn: String, change: Change): js.Promise[_]
  /**
    * Performs an LDAP modifyDN against the server.
    */
  def modifyDN(dn: String, newName: String): js.Promise[_]
  /**
    * Performs an LDAP search against the server.
    *
    * Note that the defaults for options are a 'base' search.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  def search(base: String, options: SearchOptions): js.Promise[js.Array[_]]
  /**
    * Unbinds this client from the LDAP server.
    *
    */
  def unbind(): js.Promise[_]
}

object LdapClient {
  @scala.inline
  def apply(
    add: (String, js.Object) => CallbackTo[js.Promise[js.Any]],
    bind: (String, String) => CallbackTo[js.Promise[js.Any]],
    del: String => CallbackTo[js.Promise[js.Any]],
    destroy: CallbackTo[js.Promise[Unit]],
    modify: (String, Change) => CallbackTo[js.Promise[js.Any]],
    modifyDN: (String, String) => CallbackTo[js.Promise[js.Any]],
    search: (String, SearchOptions) => CallbackTo[js.Promise[js.Array[js.Any]]],
    unbind: CallbackTo[js.Promise[js.Any]]
  ): LdapClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => add(t0, t1).runNow()))
    __obj.updateDynamic("bind")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => bind(t0, t1).runNow()))
    __obj.updateDynamic("del")(js.Any.fromFunction1((t0: java.lang.String) => del(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("modify")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.ldapjsClient.mod.Change) => modify(t0, t1).runNow()))
    __obj.updateDynamic("modifyDN")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => modifyDN(t0, t1).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.ldapjsClient.mod.SearchOptions) => search(t0, t1).runNow()))
    __obj.updateDynamic("unbind")(unbind.toJsFn)
    __obj.asInstanceOf[LdapClient]
  }
}

